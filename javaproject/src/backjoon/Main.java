package backjoon;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int Y = scan.nextInt();
    int newyear = Y-543;

    System.out.printf("%d", newyear);

    scan.close();

  }
}