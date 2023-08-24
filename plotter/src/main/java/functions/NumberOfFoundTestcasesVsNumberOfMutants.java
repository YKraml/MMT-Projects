package functions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import model.TablEntry;

public class NumberOfFoundTestcasesVsNumberOfMutants extends TableFunctionAbstract {

  @Override
  public Map<Double, Double> createValueTable(List<TablEntry> entries) {

    Map<Double, Double> table = new HashMap<>();
    table.put(0d, 0d);

    Set<String> foundTestCases = new HashSet<>();


    for (TablEntry entry : entries) {
      foundTestCases.addAll(entry.getFailedTestCases());
      table.put((double) entry.getNumber(), (double) foundTestCases.size());
    }
    return table;
  }

  @Override
  public String xAxisLabel() {
    return "Number of mutants generated";
  }

  @Override
  public String yAxisLabel() {
    return "Number found tests";
  }
}
