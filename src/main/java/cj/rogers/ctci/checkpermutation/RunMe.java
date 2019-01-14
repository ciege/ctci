package cj.rogers.ctci.checkpermutation;

public class RunMe {
  public static void main(String[] args) {
    Simple simple = new Simple();

    String firstString = "abcd";
    String secondString = "fedcba";
    String thirdString = "abyz";
    System.out.println("Simple");
    System.out.println("Is " + firstString + " a permutation of " + secondString + " : " +
        simple.checkPermutation(firstString, secondString));
    System.out.println("Is " + firstString + " a permutation of " + secondString + " : " +
        simple.checkPermutation(firstString, thirdString));

  }
}
