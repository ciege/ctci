package cj.rogers.ctci.isunique;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunMe {

  private static final Logger LOGGER = LoggerFactory.getLogger(RunMe.class.getName());

  public static void main(String[] args) {
    test(new Simple());
    test(new Sets());
    test(new Streams());
  }

  private static void test(IsUnique isUnique) {
    if(LOGGER.isInfoEnabled()) {
      LOGGER.info(isUnique.getClass().getSimpleName());
      String unique = "abcd";
      LOGGER.info(String.format("\"%s\" is unique: %s", unique, isUnique.isUnique(unique)));
      String notUnique = "abcdabcd";
      LOGGER.info(String.format("\"%s\" is unique: %s", notUnique, isUnique.isUnique(notUnique)));
      LOGGER.info("--------------------------------------------------------");
    }
  }
}
