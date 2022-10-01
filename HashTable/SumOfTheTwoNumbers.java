package HashTable;

import java.util.HashMap;
import java.util.Map;

public class SumOfTheTwoNumbers {
    public static boolean solve(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(k - nums[i])){
                return true;
            }
            else{
                map.put(nums[i], 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 24, 24, 10, 11, 5}, 15));
    }
}
