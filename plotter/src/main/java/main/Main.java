package main;

import functions.FitnessVsNumberOfMutants;
import functions.AverageNumberOfFailedTestsVsNumberOfMutants;
import functions.NumberOfFoundTestcasesVsNumberOfMutants;
import functions.NumberOfStrongMutantsVsNumberOfMutants;
import functions.TableFunction;
import io.TableReaderImpl;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import model.Graph;
import model.TablEntry;
import model.Table;
import plotting.PlotterImpl;

public class Main {

  private static String[] paths = new String[]{
      "C:\\Users\\yanni\\OneDrive\\Studium Bachelor\\6. Semester\\Bachelorarbeit\\Experiment\\Commons Cli\\Genetic",
      "C:\\Users\\yanni\\OneDrive\\Studium Bachelor\\6. Semester\\Bachelorarbeit\\Experiment\\Commons Cli\\Random",
      "C:\\Users\\yanni\\OneDrive\\Studium Bachelor\\6. Semester\\Bachelorarbeit\\Experiment\\Maths\\Genetic",
      "C:\\Users\\yanni\\OneDrive\\Studium Bachelor\\6. Semester\\Bachelorarbeit\\Experiment\\Maths\\Random",
      "C:\\Users\\yanni\\OneDrive\\Studium Bachelor\\6. Semester\\Bachelorarbeit\\Experiment\\3. Projekt\\Genetic",
      "C:\\Users\\yanni\\OneDrive\\Studium Bachelor\\6. Semester\\Bachelorarbeit\\Experiment\\3. Projekt\\Random"
  };

  private final static TableReaderImpl tableReaderGenetic = new TableReaderImpl(paths[2]);
  private final static TableReaderImpl tableReaderRandom = new TableReaderImpl(paths[3]);
  private final static PlotterImpl plotter = new PlotterImpl();
  private final static TableFunction[] tableFunctions = new TableFunction[]{
      new NumberOfFoundTestcasesVsNumberOfMutants(), new NumberOfStrongMutantsVsNumberOfMutants(),
      new AverageNumberOfFailedTestsVsNumberOfMutants(), new FitnessVsNumberOfMutants()};

  public static void main(String[] args) throws IOException {

    List<Table> tablesGenetic = tableReaderGenetic.getSortedTables();
    List<Table> tablesRandom = tableReaderRandom.getSortedTables();



    for (TableFunction function : tableFunctions) {
      Graph graphGenetic = function.createAverageGraph(tablesGenetic, "genetic");
      Graph graphRandom = function.createAverageGraph(tablesRandom, "random");
      plotter.plotGraphs(function.xAxisLabel(), function.yAxisLabel(),
          List.of(graphGenetic, graphRandom));
    }



/*
    for (TableFunction function : tableFunctions) {
      List<Graph> graphGenetic = function.createGraphs(tablesGenetic);
      List<Graph> graphRandom = function.createGraphs(tablesRandom);
      plotter.plotGraphs(function.xAxisLabel(), function.yAxisLabel(), graphGenetic);
      plotter.plotGraphs(function.xAxisLabel(), function.yAxisLabel(), graphRandom);
    }*/

    saveHeatMap(true, "heatmap-strong.csv");
    saveHeatMap(false, "heatmap-all.csv");
  }

  private static void saveHeatMap(boolean onlyStrongMutants, String fileName) throws IOException {
    List<Table> sortedTables = tableReaderGenetic.getSortedTables();
    Table table = sortedTables.iterator().next();
    Collection<String> clazzes = new HashSet<>();
    Collection<String> operators = new HashSet<>();
    Map<String, Map<String, Collection<String>>> searchSpace = calcSearchSpace(table, clazzes,
        operators, onlyStrongMutants);

    writeSearchSpaceInFile(clazzes, operators, searchSpace, fileName);
  }

  private static void writeSearchSpaceInFile(Collection<String> clazzes,
      Collection<String> operators, Map<String, Map<String, Collection<String>>> searchSpace,
      String fileName)
      throws IOException {
    StringBuilder builder = new StringBuilder();
    builder.append(";");
    for (String operator : operators) {
      builder.append(operator);
      builder.append(";");
    }
    builder.deleteCharAt(builder.length() - 1);
    builder.append("\n");

    for (String clazz : clazzes) {
      builder.append(clazz);
      builder.append(";");
      for (String operator : operators) {
        builder.append(searchSpace.get(clazz).getOrDefault(operator, new ArrayList<>()).size());
        builder.append(";");
      }
      builder.deleteCharAt(builder.length() - 1);
      builder.append("\n");
    }
    builder.deleteCharAt(builder.length() - 1);

    Files.writeString(Path.of(fileName), builder.toString());
  }

  private static Map<String, Map<String, Collection<String>>> calcSearchSpace(Table table,
      Collection<String> clazzes, Collection<String> operators, boolean onlyStrongMutants) {
    Map<String, Map<String, Collection<String>>> searchSpace = new HashMap<>();


    Map<String, Collection<String>> testCasesMap = new HashMap<>();
    for (TablEntry entry : table.getSortedEntries()) {
      for (String failedTestCase : entry.getFailedTestCases()) {
        testCasesMap.putIfAbsent(failedTestCase, new ArrayList<>());
        testCasesMap.get(failedTestCase).add(entry.getMutant());
      }
    }

    for (TablEntry tableEntry : table.getSortedEntries()) {
      String[] split = tableEntry.getMutant().split(" \\| ");

      String className = split[0];
      String operator = split[1];
      String location = split[2];

      clazzes.add(className);
      operators.add(operator);

      searchSpace.computeIfAbsent(className, c -> new HashMap<>());
      searchSpace.get(className).computeIfAbsent(operator, o -> new ArrayList<>());

      if (tableEntry.isStrong(testCasesMap) || !onlyStrongMutants) {
        searchSpace.get(className).get(operator).add(location);
      }


    }
    return searchSpace;
  }


}
