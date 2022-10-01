package Recursion.java67;

import java.util.Scanner;

public class ReverceString {
    private static String str;

    public static void main(String[] args) {
        readInput();
        System.out.println(reverceString(str));

    }

    private static String reverceString(String str2) {
        if (str2.length() <= 1){
            return str2;
        }
        return reverceString(str2.substring(1)) + str2.charAt(0);
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
    }
}
