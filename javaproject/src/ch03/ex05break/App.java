package ch03.ex05break;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws IOException {

    FileInputStream fis = new FileInputStream("res/letters.data");
    Scanner scan = new Scanner(fis);
    // FileOutputStream fos = new FileOutputStream("res/kors.out");
    // PrintStream out = new PrintStream(fos);

    int nextindex = 0;
    int count = 0;
    int selfindex = 0;
    
    while (scan.hasNextLine()) {
      if(count == 3) 
      break;
      String line = scan.nextLine();
      if (line.equals("O")) 
      count++;
      
      nextindex++;
      // String line = scan.nextLine();
      // if(!line.equals("O"))
      // index++;
      // else
      // break;
      
      selfindex = nextindex-1;
    }
    System.out.printf("%d\n", nextindex);
    System.out.printf("%d\n", count);
    System.out.printf("%d\n", selfindex);

    scan.close();
    fis.close();

    // out.close();
    // fos.close();

  }
}
