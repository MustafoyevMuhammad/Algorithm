package Recursion.java67;

import java.math.BigInteger;
import java.util.Scanner;

public class GreatestCommonDivision {
    private static int A;
    private static int B;

    public int solve(int[] nums) {

        if (nums.length == 1) return nums[0];
        else if (nums.length >= 2){
            int i = 0;
            while (i < nums.length - 1) {
                nums[i + 1] = greatestCommonDivision(nums[i], nums[i+1]);
                i++;
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        readInput();
        System.out.println(greatestCommonDivision(A,B));

    }

    private static int greatestCommonDivision(int a, int b){
        if(b == 0) return a;
        else if(b == 1) return b;
        else return greatestCommonDivision(b,a % b);
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
    }
}
