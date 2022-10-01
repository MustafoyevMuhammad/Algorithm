package QuickSort.DivideAndConquer;

public class MajorityVoteSecondSolutionNotMine {

    public static void main(String[] args) {
        int[] a = {4, 2, 1, 1, 2, 4, 5, 2, 3, 3, 2, 2, 2, 2, 2}; //{5, 5, 1, 1, 2, 2, 2, 2, 2};
        System.out.println(solve(a));
    }

    public static int solve(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for (int i : nums) {
            if (i == majority) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = i;
                    count = 1;
                }
            }
        }
        count = 0;
        for (int i : nums) {
            if (majority == i) {
                count++;
            }
        }
        return count > nums.length / 2 ? majority : -1;
    }


}
