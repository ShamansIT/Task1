package ua.com.fineline;

import java.util.Locale;
import java.util.Scanner;

public class SubTask1 {

    public SubTask1(){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("\n\tEnter first num:\t");
        double fNum = sc.nextDouble();
        System.out.print("\n\tEnter second num:\t");
        double sNum = sc.nextDouble();
        System.out.println("\n\tSum number  = " + (fNum+sNum));
        sc.close();
        }
}
