package cj.rogers.ctci.checkpermutation;

public class Simple implements CheckPermutation {
  @Override
  public boolean checkPermutation(String firstString, String secondString) {
    char[] firstCharArray;
    char[] secondCharArray;
    if(firstString.equals(secondString)) {
      return true;
    }

    if(firstString.length() < secondString.length()) {
      firstCharArray = firstString.toCharArray();
      secondCharArray = secondString.toCharArray();
    } else {
      firstCharArray = secondString.toCharArray();
      secondCharArray = firstString.toCharArray();
    }

    for(int i = 0; i < firstCharArray.length; i++) {
      for(int j = 0; j < secondCharArray.length; j++) {
        if(firstCharArray[i] == secondCharArray[j]) {
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
