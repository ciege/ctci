package cj.rogers.ctci.isunique;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simple {
  private static final Logger logger = LoggerFactory.getLogger(Simple.class.getName());
  public static boolean isUnique(final String string) {
    char[] charArray = string.toCharArray();
    for(int i = 0; i < charArray.length; i++) {
      for(int j = i + 1; j < charArray.length; j++) {
        logger.debug(charArray[i]+" "+charArray[j]);
        if(charArray[i] == charArray[j]) {
          return false;
        }
      }
    }
    return true;
  }
}
