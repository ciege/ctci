package cj.rogers.ctci.checkpermutation;

public class Simple implements CheckPermutation {
  @Override
  public boolean checkPermutation(String firstString, String secondString) {
    char[] firstCharArray;
    char[] secondCharArray;
    if(baseCases(firstString, secondString)) {
      return true;
    }

    if(firstString.length() < secondString.length()) {
      firstCharArray = firstString.toCharArray();
      secondCharArray = secondString.toCharArray();
    } else {
      firstCharArray = secondString.toCharArray();
      secondCharArray = firstString.toCharArray();
    }

    for(char c : firstCharArray) {
      for(int j = 0; j < secondCharArray.length; j++) {
        if(c == secondCharArray[j]) {
          secondCharArray[j] = Character.MIN_VALUE;
          break;
        } else if((j + 1) >= secondCharArray.length) {
          return false;
        }
      }
    }
    return true;
  }

}
