package ch02.ex02complex;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("성별(남:1, 여:2):");
    int x = scan.nextInt();
    String gender = (x == 1) ? "남자" : "여자";
    System.out.printf("당신의 성별은 %s이군요\n", gender);

    System.out.println(scan instanceof Scanner);

    scan.close();
  }
}
