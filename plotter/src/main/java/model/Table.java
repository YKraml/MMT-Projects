package model;

import java.util.List;

public class Table {

  private final String name;
  private final List<TablEntry> sortedEntries;

  public Table(String name, List<TablEntry> sortedEntries) {
    this.name = name;
    this.sortedEntries = sortedEntries;
  }

  public String getName() {
    return name;
  }

  public List<TablEntry> getSortedEntries() {
    return sortedEntries;
  }
}
