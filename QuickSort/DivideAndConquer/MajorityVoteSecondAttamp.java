package QuickSort.DivideAndConquer;

import java.util.TreeSet;

public class MajorityVoteSecondAttamp {

    public static void main(String[] args) {
        int[] a = {5, 5, 1, 1, 2, 2, 2, 2, 2}; //{5, 5, 1, 1, 2, 2, 2, 2, 2};
        System.out.println(solve(a));
    }

    public static int solve(int[] nums) {
        if (nums.length < 1) return -1;
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        boolean ok = false;
        int k = 0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (list.first() == nums[j])
                    k++;
                if (k > nums.length / 2) {
                    ok = true;
                    break;
                }
            }
            if (ok) break;
            k = 0;
            list.pollFirst();
        }
        int result = ok ? list.first() : -1;
        return result;
    }

}
