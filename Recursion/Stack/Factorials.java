package Recursion.Stack;

import java.util.Scanner;

public class Factorials {
    private static int number;
    private static int multiply = 1;

    public static void main(String[] args) {
        readInput();
        System.out.println(factorial(number));
        System.out.println(factorial2(number));
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
    }

    public static int factorial(int number) {
        multiply *= number;
        if (number > 1) return factorial(number - 1);
        else return multiply;
    }

    public static int factorial2(int x) {
        if (x == 1) return 1;
        else return x * factorial2((x - 1));
    }
}
