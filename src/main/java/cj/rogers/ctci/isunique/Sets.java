package cj.rogers.ctci.isunique;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class Sets {
  private static final Logger logger = LoggerFactory.getLogger(Sets.class.getName());
  public static boolean isUnique(final String string) {
    char[] charArray = string.toCharArray();
    Set set = new HashSet(string.length());
    for(int i = 0; i < charArray.length; i++) {
      set.add(charArray[i]);
    }
    return set.size() == string.length();
  }
}
