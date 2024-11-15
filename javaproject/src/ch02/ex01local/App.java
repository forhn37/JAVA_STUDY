package ch02.ex01local;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("x:");
    int x = scan.nextInt();

    System.out.println(x == 3);
    System.out.println(x == 0 || x == 2);
    System.out.println(-2 < x && x <= 2);

    System.out.println( (x % 2) == 0);
    System.out.println((x % 2) != 0 && (x % 3)== 0);

    scan.close();
  }
}
