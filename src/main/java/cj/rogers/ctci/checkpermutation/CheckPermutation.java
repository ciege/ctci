package cj.rogers.ctci.checkpermutation;

public interface CheckPermutation {
  boolean checkPermutation(String firstString, String secondString);

  default boolean baseCases(String firstString, String secondString) {
    return firstString.equals(secondString);
  }
}
