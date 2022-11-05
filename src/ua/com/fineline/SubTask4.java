package ua.com.fineline;

import java.util.Scanner;

public class SubTask4 {

    public SubTask4(){
        int sumNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\tEnter num:\t");
        int num = sc.nextInt();
        int length = String.valueOf(num).length();
        for (int i = 1;i<=length;i++){
            while (num > 0) {
                sumNum = sumNum + num % 10;
                num = num / 10;
            }
        }
        System.out.println("\n\tSum of num: "+sumNum);
    }
}
