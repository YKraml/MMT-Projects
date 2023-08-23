package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TablEntry {

  private final int Number;
  private final String Mutant;
  private final boolean Detected;
  private final Map<String, String> testCases;

  public TablEntry(int number, String mutant, boolean detected, Map<String, String> testCases) {
    Number = number;
    Mutant = mutant;
    Detected = detected;
    this.testCases = testCases;
  }

  public int getNumber() {
    return Number;
  }

  public String getMutant() {
    return Mutant;
  }

  public boolean isDetected() {
    return Detected;
  }

  public Map<String, String> getTestCases() {
    return Collections.unmodifiableMap(testCases);
  }

  public List<String> getFailedTestCases() {
    List<String> failedTestCases = new ArrayList<>();

    testCases.entrySet().stream().filter(stringStringEntry -> {
      return !Objects.equals(stringStringEntry.getValue(), "OK")
          && !Objects.equals(stringStringEntry.getValue(), "Ignored");
    }).forEach((s) -> failedTestCases.add(s.getKey()));

    return Collections.unmodifiableList(failedTestCases);

  }

  public boolean isStrong(Map<String, Collection<String>> testCasesMap) {

    for (String failedTestCase : getFailedTestCases()) {
      if(testCasesMap.get(failedTestCase).size() > 1){
        return false;
      }
    }

    return true;
  }
}
