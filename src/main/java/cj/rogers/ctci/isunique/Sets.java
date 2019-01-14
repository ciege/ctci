package cj.rogers.ctci.isunique;

import java.util.HashSet;
import java.util.Set;

public class Sets implements IsUnique {
  public  boolean isUnique(final String string) {

    if(baseCases(string)) {
      return true;
    }

    char[] charArray = string.toCharArray();
    Set<Character> set = new HashSet<>(string.length());
    for(char c : charArray) {
      set.add(c);
    }

    return set.size() == string.length();
  }
}
