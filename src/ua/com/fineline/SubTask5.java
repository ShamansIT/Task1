package ua.com.fineline;

import java.util.Scanner;

public class SubTask5 {

    public SubTask5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\tEnter stop point of num:\t");
        int stopNum = sc.nextInt();
        for (int i = 1; i < stopNum; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(" " + i);
            }
        }
    }
}