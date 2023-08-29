package functions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.TablEntry;

public class AverageNumberOfFailedTestsVsNumberOfMutants extends
    TableFunctionAbstract {

  @Override
  public Map<Double, Double> createValueTable(List<TablEntry> entries) {

    Map<Double, Double> values = new HashMap<>();

    double sum = 0;

    for (TablEntry entry : entries) {

      int number = entry.getNumber() + 1;
      List<String> failedTestCases = entry.getFailedTestCases();

      sum += failedTestCases.size();

      double average = sum / number;

      values.put((double) number, average);

    }

    return values;
  }

  @Override
  public String xAxisLabel() {
    return "Anzahl an generierten Mutanten";
  }

  @Override
  public String yAxisLabel() {
    return "Durschnittliche Anzahl an fehlgeschlagenen Tests";
  }
}
