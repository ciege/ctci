package cj.rogers.ctci.isunique;

public class Streams implements IsUnique{
  public  boolean isUnique(final String string) {

    if(baseCases(string)) {
      return true;
    }

    return string.codePoints().distinct().count() == string.length();
  }
}
