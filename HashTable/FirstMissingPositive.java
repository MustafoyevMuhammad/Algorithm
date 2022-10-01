package HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstMissingPositive {
    public static int solve(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
            if(nums[i] > 0){
                map.put(nums[i], 1);
            }
        }
        int missingPositive = 1;
        boolean ok = true;
        for (int i = 1; i <= max || i <= 1; i++) {
            if(!map.containsKey(i)){
                missingPositive = i;
                ok = false;
                return i;
            }
        }
        if(ok) missingPositive = nums[nums.length - 1] + 1;
        return missingPositive;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{-1, -2, -3}));
    }
}
