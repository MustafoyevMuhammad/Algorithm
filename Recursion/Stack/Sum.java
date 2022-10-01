package Recursion.Stack;

import java.util.Scanner;

public class Sum {
    private static int N;
    private static int count = 0;

    public static void main(String[] args) {
        readInput();    //N =  A + B + C + D; =====>    A <= B <= C <= D
        SumFourNumberWithoutRecursion();
        System.out.println(count);
    }

    private static void SumFourNumberWithoutRecursion() {
        if (N < 4) {
        } else {
            for (int A = 1; A <= N; A++) {
                int B = A;
                while (A + 3 * B <= N) {
                    int C = B;
                    while (A + B + 2 * C <= N) {
                        int D = N - (A + B + C);
                        if (D >= C) {
                            count++;
                        }
                        C++;
                    }
                    B++;
                }
            }
        }
    }
    public static void WithRecursion(){

    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }

}

