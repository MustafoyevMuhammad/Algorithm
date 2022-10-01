package Recursion.java67;

import java.util.Scanner;

public class CountDown {
    private static int number;

    public static void main(String[] args) {
        readInput();
        countDown(number);
    }

    private static void countDown(int i) {
        if (i == 0) {
            System.out.print(i);
        } else {
            System.out.print(i + " ");
            countDown(i - 1);
        }
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
    }
}
