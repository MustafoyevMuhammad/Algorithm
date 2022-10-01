package Recursion.java67;

import java.util.Scanner;

public class CalculatePowerOfTheNumber {
    private static int number;
    private static int degree;

    public static void main(String[] args) {
        readInput();
        System.out.print(powerOfNumber(number,degree));

    }

    private static long powerOfNumber(int number, int degree) {
        if(degree == 0) return 1;
        else return number * powerOfNumber(number,degree - 1);
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        degree = sc.nextInt();
    }
}
