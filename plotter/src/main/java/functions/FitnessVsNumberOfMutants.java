package functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.TablEntry;

public class FitnessVsNumberOfMutants extends TableFunctionAbstract {

  private final Map<String, Integer> subSumMap;

  public FitnessVsNumberOfMutants() {
    subSumMap = new HashMap<>();
  }

  @Override
  public Map<Double, Double> createValueTable(List<TablEntry> entries) {

    System.out.println();
    System.out.println();

    Map<Double, Double> values = new HashMap<>();

    for (TablEntry entry : entries) {
      double fitness = calcFitness(entry, entries);
      values.put((double) entry.getNumber(), fitness);
    }

    return values;
  }

  @Override
  public String xAxisLabel() {
    return "Number of generated mutants";
  }

  @Override
  public String yAxisLabel() {
    return "Fitness";
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
    }

  }
}
