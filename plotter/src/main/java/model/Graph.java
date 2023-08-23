package model;

import java.util.Map;

public class Graph {

  private final String name;
  private final Map<Double, Double> valueTable;


  public Graph(String name, Map<Double, Double> valueTable) {
    this.name = name;
    this.valueTable = valueTable;
  }

  public String getName() {
    return name;
  }

  public Map<Double, Double> getValueTable() {
    return valueTable;
  }
}
