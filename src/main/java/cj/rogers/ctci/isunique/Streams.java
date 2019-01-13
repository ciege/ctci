package cj.rogers.ctci.isunique;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Streams {
  private static final Logger logger = LoggerFactory.getLogger(Streams.class.getName());
  public static boolean isUnique(final String string) {
    return string.codePoints().distinct().count() == string.length();
  }
}
