package functions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import model.TablEntry;
import model.Graph;
import model.Table;

public abstract class TableFunctionAbstract implements TableFunction {

  @Override
  public final List<Graph> createGraphs(List<Table> sortedTables) {
    return sortedTables.stream()
        .map(table -> new Graph(table.getName(), createValueTable(table.getSortedEntries())))
        .collect(Collectors.toList());
  }

  @Override
  public final Graph createAverageGraph(List<Table> sortedTables, String graphName) {

    Map<Double, Double> valueTableSum = new HashMap<>();

    for (Table table : sortedTables) {

      Map<Double, Double> valueTable = createValueTable(table.getSortedEntries());

      for (Map.Entry<Double, Double> entry : valueTable.entrySet()) {
        valueTableSum.put(entry.getKey(),
            valueTableSum.getOrDefault(entry.getKey(), 0d) + entry.getValue());
      }

    }

    for (Map.Entry<Double, Double> entry : valueTableSum.entrySet()) {
      entry.setValue(entry.getValue() / sortedTables.size());
    }

    return new Graph(graphName, valueTableSum);
  }


  @Override
  public abstract Map<Double, Double> createValueTable(List<TablEntry> entries);

  @Override
  public abstract String xAxisLabel();

  @Override
  public abstract String yAxisLabel();
}
