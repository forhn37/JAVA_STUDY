package ch03.ex08testscore;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {

  public static void clear() {
    try {
      String operatingSystem = System.getProperty("os.name");
      if (operatingSystem.contains("Windows")) {
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
        Process startProcess = pb.inheritIO().start();
        startProcess.waitFor();
      } else {
        ProcessBuilder pb = new ProcessBuilder("clear");
        Process startProcess = pb.inheritIO().start();
        startProcess.waitFor();
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  public static void main(String[] args) throws IOException {

    // Test Score ... intro
    Scanner scan = new Scanner(System.in);
    while(true) {

      clear();
      {
  
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│ Test Score Management System │");
        System.out.println("└──────────────────────────────┘");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("────────────────────────────────");
        System.out.println("Press any key to Continue");
  
        scan.nextLine();
  
      }
  
      // Test Score List
      {
        clear();
  
        FileInputStream fis = new FileInputStream("res/exams.csv");
        Scanner filescan = new Scanner(fis);
  
        if (filescan.hasNextLine())
          filescan.nextLine();
  
        System.out.println("┌──────────────────────────────┐");
        System.out.println("│       Test Score List        │");
        System.out.println("└──────────────────────────────┘");
        System.out.println("────────────────────────────────");
        System.out.printf("%s,%s,%s,%s,%s\n", "KOR", "ENG", "MATH", "TOTAL", "AVG");
  
        while (filescan.hasNextLine()) {
          String line = filescan.nextLine();
          String[] tokens = line.split(",");
  
          int kor = Integer.parseInt(tokens[0]);
          int eng = Integer.parseInt(tokens[1]);
          int math = Integer.parseInt(tokens[2]);
          int total = kor + eng + math;
          float avg = ((float) total) / 3;
  
          System.out.printf("%d,%d,%d,%d,%.2f\n", kor, eng, math, total, avg);
        }
  
        System.out.println();
        System.out.println("Press any key to Continue");
  
        filescan.close();
        fis.close();
  
        scan.nextLine();
  
      }
  
      // // Test Score Input
      {
        clear();
  
        int kor = 0;
        int eng = 0;
        int math = 0;
  
        FileOutputStream fos = new FileOutputStream("res/exams.csv", true);
        PrintStream out = new PrintStream(fos);
  
        System.out.print("kor:");
        kor = Integer.parseInt(scan.nextLine());
        System.out.print("eng:");
        eng = Integer.parseInt(scan.nextLine());
        System.out.print("math:");
        math = Integer.parseInt(scan.nextLine());
  
        out.println();
        out.print(kor);
        out.print(",");
        out.print(eng);
        out.print(",");
        out.print(math);
  
        out.close();
        fos.close();
  
      }
      // scan.close();
    }
    

    // }

    // FileInputStream fis = new FileInputStream("res/exams.csv");
    // Scanner scan = new Scanner(fis);
    // FileOutputStream fos = new FileOutputStream("res/exams.out");
    // PrintStream out = new PrintStream(fos);

    // // int index = 0;
    // // int total = 0;
    // // floaavg = 0;

    // out.print("KOR,");
    // out.print("ENG,");
    // out.print("MATH,");
    // out.print("TOTAL,");
    // out.println("AVG");

    // while (scan.hasNextLine()) {

    // String line = scan.nextLine();
    // String[] tokens = line.split(",");

    // if (!isNumeric(tokens[0]))
    // continue;

    // int kor = Integer.parseInt(tokens[0]);
    // int eng = Integer.parseInt(tokens[1]);
    // int math = Integer.parseInt(tokens[2]);
    // int total = kor + eng + math;
    // float avg = ((float) total) / 3;

    // out.printf("%d,", kor);
    // out.printf("%d,", eng);
    // out.printf("%d,", math);
    // out.printf("%d,", total);
    // out.printf("%.2f", avg);

    // if (scan.hasNextLine())
    // out.println();

    // }

    // scan.close();
    // fis.close();

    // out.close();
    // fos.close();

    // }

    // public static boolean isNumeric(String str) {
    // try {
    // // Double.parseDouble(str);
    // Integer.parseInt(str);
    // return true;
    // } catch (Exception e) {
    // return false;
    // }
  }
}