package cj.rogers.ctci.isunique;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simple implements IsUnique{
  private static final Logger LOGGER = LoggerFactory.getLogger(Simple.class.getName());

  public  boolean isUnique(final String string) {

    if(baseCases(string)) {
      return true;
    }

    char[] charArray = string.toCharArray();
    for(int i = 0; i < charArray.length; i++) {
      for(int j = i + 1; j < charArray.length; j++) {
        if(LOGGER.isDebugEnabled()) LOGGER.debug(String.format("%s %s", charArray[i], charArray[j]));
        if(charArray[i] == charArray[j]) {
          return false;
        }
      }
    }
    return true;
  }
}
