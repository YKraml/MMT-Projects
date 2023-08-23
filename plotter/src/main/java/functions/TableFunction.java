package functions;

import java.util.List;
import java.util.Map;
import model.TablEntry;
import model.Graph;
import model.Table;

public interface TableFunction {

  List<Graph> createGraphs(List<Table> tables);

  Graph createAverageGraph(List<Table> sortedTables, String genetic);

  Map<Double, Double> createValueTable(List<TablEntry> entries);

  String xAxisLabel();

  String yAxisLabel();
}
