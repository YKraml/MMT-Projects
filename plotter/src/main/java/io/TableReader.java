package io;

import java.io.IOException;
import java.util.List;
import model.TablEntry;
import model.Table;

public interface TableReader {

  List<Table> getSortedTables() throws IOException;

  List<TablEntry> getSortedEntriesFromFile(String fileName) throws IOException;
}
