package ch01.string;

public class App {
  public static void main(String[] args) {
    String greeting1 = new String("Hello");
    String greeting2 = "Hello";
    String greeting3 = "Hello";
    
    System.out.println(greeting1 == greeting3);
    System.out.println(greeting1.equals(greeting3));
  }
}
