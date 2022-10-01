package QuickSort.DivideAndConquer;

import java.util.*;

public class MajorityVote {

    public static void main(String[] args) {
        int[] a = {1, 0, 0, 5, 3}; //{5, 5, 1, 1, 2, 2, 2, 2, 2};
        System.out.println(solve(a));
    }

    public static int solve(int[] nums) {
        if (nums.length < 1) return -1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
//        list = quickSort(list);
        TreeSet<Integer> candidate = new TreeSet<>();
        candidate.addAll(list);
        int k = 0;
        int i = 0;
        boolean ok = false;
        for (; i < list.size(); i++) {
            if (!candidate.isEmpty()) {
                if (candidate.first() == list.get(i)) {
                    k++;
                    if (k > list.size() / 2) {
                        ok = true;
                        break;
                    }
                } else {
                    i--;
                    candidate.pollFirst();
                    k = 0;
                }
            } else break;
        }
        int result = ok ? candidate.first() : -1;
        return result;
    }

    public static List<Integer> quickSort(List<Integer> list) {
        if (list.size() <= 1) return list;
        List<Integer> smallestList = new ArrayList<>();
        List<Integer> greatestList = new ArrayList<>();
        int pivot = list.get(list.size() / 2);
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() / 2) {
            } else if (pivot > list.get(i)) smallestList.add(list.get(i));
            else greatestList.add(list.get(i));
        }
        List<Integer> arr = new ArrayList<>();
        arr.addAll(quickSort(smallestList));
        arr.add(pivot);
        arr.addAll(quickSort(greatestList));
        return arr;
    }


}
