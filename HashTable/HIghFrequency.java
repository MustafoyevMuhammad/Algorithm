package HashTable;

import java.util.HashMap;
import java.util.Map;

public class HIghFrequency {
    public static int solve(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else
                map.put(nums[i],1);
        }
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            if(max < map.get(nums[i]))
                max = map.get(nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 0}));
    }
}
