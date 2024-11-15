package ch03.ex06exams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("res/exams.csv");
    Scanner scan = new Scanner(fis);
    FileOutputStream fos = new FileOutputStream("res/exams.out");
    PrintStream out = new PrintStream(fos);


    // int index = 0;
    // int total = 0;
    // floaavg = 0;

    out.print("KOR,");
    out.print("ENG,");
    out.print("MATH,");
    out.print("TOTAL,");
    out.println("AVG");
    //반복문 완성
    while (scan.hasNextLine()) {

      String line = scan.nextLine();
      String[] tokens = line.split(",");

      if (!isNumeric(tokens[0]))
        continue;

      int kor = Integer.parseInt(tokens[0]);
      int eng = Integer.parseInt(tokens[1]);
      int math = Integer.parseInt(tokens[2]);
      int total = kor + eng + math;
      float avg = ((float) total) / 3;

      out.printf("%d,", kor);
      out.printf("%d,", eng);
      out.printf("%d,", math);
      out.printf("%d,", total);
      out.printf("%.2f", avg);

      if (scan.hasNextLine())
        out.println();

    }

    scan.close();
    fis.close();

    out.close();
    fos.close();

  }

  public static boolean isNumeric(String str) {
    try {
      // Double.parseDouble(str);
      Integer.parseInt(str);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
