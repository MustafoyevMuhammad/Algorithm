package Recursion.Stack;

import java.util.Scanner;

public class Acmp325 {
    private static int[] dx = {1, 1, -1, -1, -2, -2, 2, 2};
    private static int[] dy = {-2, 2, -2, 2, -1, 1, -1, 1};
    private static int x1, y1, x2, y2;
//
//    public static void main(String[] args) {
//        readInput();
//    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] values = str.split(", ");
        if (values.length > 0) {
            x1 = values[0].charAt(0) - 96;
            y1 = values[0].charAt(1) - 48;
            x2 = values[1].charAt(0) - 48;
            y2 = values[1].charAt(1) - 96;
        }
    }

    private static void solve() {
        int ctr = 0;
        int minx = 0, miny = 0;
        while (!(x1 == x2 && y1 == x2)) {
            for (int i = 0; i < dx.length; i++) {
                if(1 <= dx[i] + x1 && dx[i] + x1 <= 8 && 1 <= dy[i] + y1 && dy[i] + y1 <=8){
                   if(x2 == dx[i] + x1 && y2 == dy[i] + y2){
                       x1 = x2;
                       y1 = y2;
                       break;
                   }
                   else {
                       minx = Math.abs(x2 - (x1 + dx[i]));
                       miny = Math.abs(y2 - (y1 + dy[i]));
                   }
                }
            }
            ctr++;
        }
        System.out.println(ctr);
    }

}
