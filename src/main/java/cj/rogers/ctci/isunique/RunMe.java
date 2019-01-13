package cj.rogers.ctci.isunique;

public class RunMe {
  public static void main(String[] args) {
    String unique = "abcd";
    String notUnique = "abcdabcd";
    System.out.println("Simple");
    System.out.println("\"" + unique + "\" is unique: " + Simple.isUnique(unique));
    System.out.println("\"" + notUnique + "\" is unique: " + Simple.isUnique(notUnique));
    System.out.println("--------------------------------------------------------");
    System.out.println("Streams");
    System.out.println("\"" + unique + "\" is unique: " + Streams.isUnique(unique));
    System.out.println("\"" + notUnique + "\" is unique: " + Streams.isUnique(notUnique));
    System.out.println("--------------------------------------------------------");
    System.out.println("Sets");
    System.out.println("\"" + unique + "\" is unique: " + Sets.isUnique(unique));
    System.out.println("\"" + notUnique + "\" is unique: " + Sets.isUnique(notUnique));

  }
}
