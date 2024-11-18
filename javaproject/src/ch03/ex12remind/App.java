package ch03.ex12remind;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {

        // filtering, res/remind.data->res/valid.data
        {
            FileInputStream fis = new FileInputStream("javaproject/res/remind.data");
            Scanner scan = new Scanner(fis);
            FileOutputStream fos = new FileOutputStream("javaproject/res/valid.data");
            PrintStream out = new PrintStream(fos);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                if (isNumeric(line))
                    if(scan.hasNextLine()) {
                        out.println(line);
                    } else {
                        out.print(line);
                    }

                
            }

            out.close();
            fos.close();
            scan.close();
            fis.close();
        }

        // mapping, res/valid.data->grade.data
        {
            FileInputStream fis = new FileInputStream("javaproject/res/valid.data");
            Scanner scan = new Scanner(fis);
            FileOutputStream fos = new FileOutputStream("javaproject/res/grade.data");
            PrintStream out = new PrintStream(fos);
            while (scan.hasNextLine()) {

                String line = scan.nextLine();
                int grade = Integer.parseInt(line);

                if (grade == 100)
                    line = "A+";

                else if (90 <= grade && grade <= 99)
                    line = "A";

                else if (80 <= grade && grade <= 89)
                    line = "B";

                else if (70 <= grade && grade <= 79)
                    line = "C";

                else if (60 <= grade && grade <= 69)
                    line = "D";

                else
                    line = "F";

                if (scan.hasNextLine()) {

                    out.println(line);
                } else
                    out.print(line);
            }

            out.close();
            fos.close();
            scan.close();
            fis.close();

        }

        // reducing : count, res/valid.data
        int count = 0;
        {
            FileInputStream fis = new FileInputStream("javaproject/res/valid.data");
            Scanner scan = new Scanner(fis);

            while (scan.hasNextLine()) {

                scan.nextLine();
                count++;
            }
            System.out.printf("%d\n", count);
            scan.close();
            fis.close();

        }

        // reducing : total, res/valid.data
        int total = 0;
        {
            FileInputStream fis = new FileInputStream("javaproject/res/valid.data");
            Scanner scan = new Scanner(fis);

            while (scan.hasNextLine()) {

                total += Integer.parseInt(scan.nextLine());
            }

            scan.close();
            fis.close();
            System.out.println(total);

        }
        double avg = 0;
        // reducing : avg
        {
            avg = total / (double)count;
            System.out.printf("%.2f", avg);

        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
