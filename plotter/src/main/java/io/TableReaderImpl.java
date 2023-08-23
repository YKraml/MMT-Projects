package io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import model.TablEntry;
import model.Table;

public class TableReaderImpl implements TableReader {

  private final String folderPath;

  public TableReaderImpl(String folderPath) {
    this.folderPath = folderPath;
  }

  @Override
  public List<Table> getSortedTables() throws IOException {
    List<Table> tables = new ArrayList<>();
    for (File file : Objects.requireNonNull(new File(folderPath).listFiles())) {
      String fileName = file.getPath();
      tables.add(new Table(fileName, getSortedEntriesFromFile(fileName)));
    }
    return tables;
  }

  @Override
  public List<TablEntry> getSortedEntriesFromFile(String fileName) throws IOException {
    List<String> lines = Files.readAllLines(Path.of(fileName));

    String[] firstLine = lines.get(0).split(";");

    List<TablEntry> entries = new ArrayList<>();

    for (int j = 1; j < lines.size() - 2; j++) {

      String[] split = lines.get(j).split(";");

      int number = Integer.parseInt(split[0]);
      String mutant = split[1];
      boolean detected = Boolean.parseBoolean(split[2]);
      Map<String, String> testCases = new HashMap<>();

      for (int i = 3; i < firstLine.length; i++) {
        testCases.put(firstLine[i], split[i]);
      }

      entries.add(new TablEntry(number, mutant, detected, testCases));
    }

    entries.sort(Comparator.comparingInt(TablEntry::getNumber));
    return entries;
  }
}
