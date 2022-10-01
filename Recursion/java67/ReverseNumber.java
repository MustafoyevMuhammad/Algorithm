package Recursion.java67;

import java.util.Scanner;

public class ReverseNumber {
    private static int number;

    public static void main(String[] args) {
        readInput();
        int length = (number + "").length();
        System.out.print(reverseNumber(number, length - 1));

    }

    private static int reverseNumber(int n, int i) {
        if (n / 10 <= 1) {
            return n;
        } else return (int) (n % 10 * Math.pow(10, i) + reverseNumber(n / 10, i - 1));
    }

    private static String withString(int n) {
        if (n / 10 <= 1) {
            return n + "";
        } else return n % 10 + "" + withString(n / 10);
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
    }
}
