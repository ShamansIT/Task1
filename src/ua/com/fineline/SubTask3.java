package ua.com.fineline;

import java.util.Scanner;

public class SubTask3 {

    public SubTask3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\tEnter first num:\t");
        int fNum = sc.nextInt();
        System.out.print("\n\tEnter second num:\t");
        int sNum = sc.nextInt();

        int max = Math.max(fNum, sNum);
        int maxDivider = 0;

        for (int i = max; i >= 1; i--) {
            if (fNum % i == 0 && sNum % i == 0) {
                maxDivider = i;
                break;
            }
        }
        System.out.println("\n\tMin divider  = " + maxDivider);
        sc.close();
    }
}
