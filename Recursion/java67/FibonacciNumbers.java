package Recursion.java67;

import java.util.Scanner;

public class FibonacciNumbers {
    private static int number;
    public static void main(String[] args) {
        readInput();
        int fibonacciNumber = fibonacci(number);
        System.out.println(fibonacciNumber);
    }
    private static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static void readInput() {
        Scanner sc=new Scanner(System.in);
        number = sc.nextInt();
    }
}
