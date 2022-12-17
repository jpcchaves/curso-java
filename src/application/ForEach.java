package application;

public class ForEach {
  public static void main(String[] args) {

    String[] vect = new String[]{"Maria", "Bob", "Alex"};

    for (String person : vect) {
      System.out.println(person);
    }
  }
}
