package Recursion.Stack;

import java.util.Scanner;

import static java.lang.Math.*;

public class chessboard {
    private static String str1;
    private static String str2;

    public static void main(String[] args) {
        readInput();
        str1.replace(",", "");
        int a1 = str1.charAt(0) - 96, b1 = str1.charAt(1) - 48;
        int a2 = str2.charAt(0) - 96, b2 = str2.charAt(1) - 48;
        check(0, a1, b1, a2, b2);
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        str2 = sc.next();
    }

    public static void check(int i, int a1, int b1, int a2, int b2) {
        boolean a = true;
        int min1 = a2 - a1, min2 = b2 - b1;
        if (i > 2 && a) {
            a = false;
            System.out.println("NO");
            return;
        }
        if (abs(a1 - a2) == 2 && abs(b1 - b2) == 1 || abs(a1 - a2) == 1 && abs(b1 - b2) == 2) {
            i++;
            System.out.println(i);
            return;
        } else if (min1 > 0 && min2 > 0) {
            i++;
            check(i, a1 + 2, b1 + 1, a2, b2);
//            check(i, a1+ 1, b1 + 2, a2, b2 );
        } else if (min1 > 0 && min2 < 0) {
            i++;
            check(i, a1 + 2, b1 - 1, a2, b2);
//            check(i, a1+ 1, b1 - 2, a2, b2 );
        } else if (min1 < 0 && min2 < 0) {
            i++;
            check(i, a1 - 2, b1 - 1, a2, b2);
//            check(i, a1 - 1, b1 - 2, a2, b2 );
        }
        if (a && (a1 == a2 && b1 != b2 || a1 != a2 && b1 == b2) || i > 2 || i == 2 && (abs(a1 - a2) == 2 && abs(b1 - b2) == 1 || abs(a1 - a2) == 1 && abs(b1 - b2) == 2)) {
            a = false;
            System.out.println("NO");
            return;
        }
    }
}
