package Recursion.java67;

import javax.swing.*;
import java.util.Scanner;

public class ConvertDecimalToBinary {
    private static int decimal;

    public static void main(String[] args) {
        readInput();
        System.out.println(toBinary(decimal));
    }

    private static String toBinary(int n){
        if (n == 0) return 0+"";
        else if (n == 1) return 1+"";
        else  return toBinary(n / 2) + "" + n % 2;
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        decimal = sc.nextInt();
    }
}
