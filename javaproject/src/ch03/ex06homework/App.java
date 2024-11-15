package ch03.ex06homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("res/kors.data");
    Scanner scan = new Scanner(fis);
    // FileOutputStream fos = new FileOutputStream("res/kors.out");
    // PrintStream out = new PrintStream(fos);

    int count = 0;
    while (scan.hasNextLine()) {

      String line = scan.nextLine();

      if (!isNumeric(line))
        continue;

      count++;
      System.out.printf("%s\n", line);
      
      if (count == 5)
        break;
    }

    scan.close();
    fis.close();

    // out.close();
    // fos.close();

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
