package ch01.ex03file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class App {
  public static void main(String[] args) throws IOException {

    int kor1 = 80;
    int kor2 = 90;
    int kor3 = 100;

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

    System.out.print("┌─────────────┐\n");
    System.out.println("│   성적출력  │");
    System.out.println("└─────────────┘");

    System.out.printf("kor1 : %d(%x)(%o)\n", kor1, kor1,kor1);
    System.out.printf("kor2 : %d\n", kor2);
    System.out.printf("kor3 : %d(%o)\n", kor3,kor3);

  }
}
