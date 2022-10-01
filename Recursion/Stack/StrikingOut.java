package Recursion.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class StrikingOut {
    private static String number;
    private static int counts = 0;
    private static TreeSet arrayList;

    public static void main(String[] args) {
        readInput();
        if (number.length() < 3) System.out.println(0);
        else {
            arrayList = new TreeSet();
            for (int i = 100; i < 1000; i++) {
                String temp = number;
                String t = i + "";
                int inx, inx2, inx3;
                if (temp.contains(t.charAt(0) + "")) {
                    inx = temp.indexOf(t.charAt(0));
                    temp = temp.substring(inx + 1);
                    if (temp.contains(t.charAt(1) + "")) {
                        inx2 = temp.indexOf(t.charAt(1));
                        temp = temp.substring(inx2 + 1);
                        if (number.contains(t.charAt(2) + "")) {
                            if (!arrayList.contains(t)) {
                                counts++;
                                arrayList.add(t);
                            }


                        }
                    }
                }

            }
            System.out.println(counts);
        }
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        number = sc.next();

    }


//    private static void FindThreeDigitWithoutRecursion() {
//        String threeDigit;
//        arrayList = new ArrayList();
//        for (int i = 0; i < number.length(); i++) {
//            for (int j = i + 1; j < number.length(); j++) {
//                for (int k = j + 1; k < number.length(); k++) {
//                    if (number.charAt(i) != '0') {
//                        threeDigit = "" + number.charAt(i) + number.charAt(j) + number.charAt(k);
//                        if (!arrayList.contains(threeDigit)) {
//                            counts++;
//                            arrayList.add(threeDigit);
//                        }
//                    }
//                }
//            }
//        }
//    }


}
