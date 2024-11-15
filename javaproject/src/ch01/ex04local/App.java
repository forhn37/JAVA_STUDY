package ch01.ex04local;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws IOException {

    int kor1 = 80;
    int kor2 = 90;
    int kor3 = 100;

    // 성적로드
    {
      FileInputStream fis = new FileInputStream("res/kors.txt");
      Scanner scan = new Scanner(fis);

      kor1 = scan.nextInt();
      kor2 = scan.nextInt();
      kor3 = scan.nextInt();
      kor1++;
      
      scan.close();
      fis.close();
    }

    // 성적입력
    {
      Scanner scan = new Scanner(System.in);
      System.out.print("kor1:");
      kor1 = scan.nextInt();
      System.out.print("kor2:");
      kor2 = scan.nextInt();
      System.out.print("kor3:");
      kor3 = scan.nextInt();

      scan.close();
    }

    // 성적저장
    {
      FileOutputStream fos = new FileOutputStream("res/kors.txt");
      PrintStream out = new PrintStream(fos);

      out.print(" ");
      out.print(kor1);
      out.print(" ");
      out.print(kor2);
      out.print(" ");
      out.print(kor3);

      out.close();
      fos.close();
    }

    // 성적출력
    {
      System.out.print("┌─────────────┐\n");
      System.out.println("│   성적출력  │");
      System.out.println("└─────────────┘");

      System.out.printf("kor1 : %d(%x)(%o)\n", kor1, kor1, kor1);
      System.out.printf("kor2 : %d\n", kor2);
      System.out.printf("kor3 : %d(%o)\n", kor3, kor3);
    }

  }
}
