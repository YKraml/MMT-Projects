package functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.TablEntry;

public class NumberOfStrongMutantsVsNumberOfMutants extends TableFunctionAbstract {

  private final Map<String, Integer> subSumMap;

  public NumberOfStrongMutantsVsNumberOfMutants() {
    subSumMap = new HashMap<>();
  }
  @Override
  public Map<Double, Double> createValueTable(List<TablEntry> entries) {

    int maxFitness = entries.size() * entries.get(0).getTestCases().size();

    Map<Double, Double> table = new HashMap<>();
    table.put(0d, 0d);

    int strongCount = 0;
    for (TablEntry entry : entries) {
      double fitness = calcFitness(entry, entries);

      if(fitness + 1 >= maxFitness){
        strongCount++;
      }

      table.put((double) entry.getNumber(), (double) strongCount);
    }

    return table;
  }

  @Override
  public String xAxisLabel() {
    return "Number of mutants generated";
  }

  @Override
  public String yAxisLabel() {
    return "Number of strong mutants";
  }


  private double calcFitness(TablEntry entry, List<TablEntry> entries) {
    Map<String, String> testCases = entry.getTestCases();

    int numberOfTests = testCases.size();
    int numberOfMutants = entries.size();

    double sum = 0;
    for (String testCase : testCases.keySet()) {
      boolean testpasses = testCases.get(testCase).equals("OK")
          || testCases.get(testCase).equals("Ignored");
      sum += (testpasses ? 0 : 1) * calcSubSum(testCase, entries);
    }


    return numberOfMutants * numberOfTests - sum;
  }


  private double calcSubSum(String testCase, List<TablEntry> allMutants) {

    if (subSumMap.containsKey(testCase)) {
      return subSumMap.get(testCase);
    } else {
      int subSum = 0;
      for (TablEntry mutant : allMutants) {
        Map<String, String> testCases = mutant.getTestCases();
        boolean testPassed = testCases.get(testCase).equals("OK")
            || testCases.get(testCase).equals("Ignored");
        subSum += testPassed ? 0 : 1;
      }
      subSumMap.put(testCase, subSum);
      return subSum;
    }}
}
