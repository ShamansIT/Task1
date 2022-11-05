package ua.com.fineline;

import java.util.Scanner;

    public class SubTask2 {

        public SubTask2(){

            boolean isOut = true;
            StringBuilder stringOut = new StringBuilder();
            System.out.print("Program end when your input double Enter");
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("\n\tEnter line:\t");
                String line = sc.nextLine();
                if (line.length() == 0) {
                    stringOut.append(line);
                    isOut = false;}
                else stringOut.append(line).append(" ");
            }
            while (isOut);
            stringOut = new StringBuilder(stringOut.substring(0, stringOut.length() - 1));
            System.out.print("\n\t" + stringOut);
            sc.close();
        }
}


