package QuickSort.DivideAndConquer;

public class MaxSubArrayNotMine {
    public static int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            if (current > max)
                max = current;
            if (current < 0) {
                current = 0;
            }
        }
        return max;
    }
    public static int withRecursion(int[] nums,int max, int i,int current){
        current += nums[i];
        if(current > max) max = current;
        if (current < 0) current = 0;
        if(i == nums.length - 1){
            return max;
        }
        else {
            return withRecursion(nums, max, i +1, current);
        }
    }

    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        System.out.println(maxSubArray(a));
        System.out.println(withRecursion(a,Integer.MIN_VALUE, 0,0));
    }
}
