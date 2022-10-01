package QuickSort.DivideAndConquer;

public class LargestSublistSum {
    static int touch = -9999999;

    public static int solve(int[] nums) {
        if (nums.length < 1) return -1;
        int sum = 0, i;
        boolean b = true;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                sum += nums[i];
                b = true;
                break;
            } else {
                b = false;
            }
        }
        if (!b) sum = nums[0];
        for (int j = 1; j < nums.length && !b; j++) {
            if (sum < nums[j]) sum = nums[j];
        }

        for (int j = i + 1; j < nums.length && b; j++) {
            if (nums[j] > 0) {
                sum += nums[j];
            } else if (j + 1 < nums.length)
                if (nums[j] <= 0 && nums[j + 1] + nums[j] > 0) {
                    sum += nums[j];
                    sum += nums[j + 1];
                    j++;
                } else
                    sum = 0;

            if (touch < sum)
                touch = sum;
        }

        if (touch < sum) touch = sum;
        return touch;
    }

    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solve(a));
    }
}
