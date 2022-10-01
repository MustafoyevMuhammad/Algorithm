package Binarysearch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ShortestSublistToRemoveToMakeSortedList {
    public static int solve(int[] nums) {
        final int N = nums.length;
        if (N < 2)
            return 0;
        boolean[] leftvalid = new boolean[N];
        leftvalid[0] = true;
        for (int i = 1; i < N; i++)
            leftvalid[i] = leftvalid[i - 1] && nums[i - 1] <= nums[i];
        boolean[] rightvalid = new boolean[N];
        rightvalid[N - 1] = true;
        for (int i = N - 2; i >= 0; i--)
            rightvalid[i] = rightvalid[i + 1] && nums[i + 1] >= nums[i];
        if (rightvalid[0])
            return 0;
        int l = 1, h = N - 2;
        while (l <= h) {
            int m = (l + h) >> 1;
            if (isCan(nums, leftvalid, rightvalid, m)) {
                h = m - 1;
            }
            else
                l = m + 1;
        }
        return l;
    }

    private static boolean isCan(int[] nums, boolean[] left, boolean[] right,final int K) {
        if(left[left.length - K - 1] && right[K])
            return true;
        for (int i = 1,j = K; j + 1 != left.length ; i++, j++) {
            if(left[i - 1] && right[j + 1] && nums[i - 1] <= nums[j + 1])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0};
        System.out.println(solve(arr));
    }
}
//11111111111111111111111111000100
//11111111111111111111111111100010
//1111111111111111111111111100010