package HashTable;

import java.util.*;

public class UniqueOccurrence {
    public static boolean solve(int[] nums){
        Map<Integer,Integer> map = new HashMap();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            set.add(map.get(nums[i]));
        }
        int sum = 0;
        while(!set.isEmpty()){
            sum += set.first();
            set.pollFirst();
        }
        if(sum == nums.length)return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 1, 1, 2, 2, 2, 3}));
    }
}
/* HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        int index = 0;
        for (int value : map.values()) {
            set.add(value);
        }

        return set.size() == map.size();
        */