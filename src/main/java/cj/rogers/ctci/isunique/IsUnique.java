package cj.rogers.ctci.isunique;

import java.security.InvalidParameterException;

public interface IsUnique {
  boolean isUnique(final String string);

  default boolean baseCases(String string){

    if(string == null || string.isEmpty()){
      throw new InvalidParameterException("Really...... you only had one job.  Send a String");
    }

    return string.length() == 1;
  }
}
