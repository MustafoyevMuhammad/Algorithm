package QuickSort.DivideAndConquer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MergingKSortedList2NOtMineBestSolution {
    static List<int[]> list = new ArrayList<>();

    public static void main(String[] args) {
        addElementToList();
        int[][] arr = {{}, {}, {10, 12}, {}, {3, 3, 13}, {3}, {10}, {0, 7}};
        int[] array = solve(arr);
        for (int i = 0; i < array.length; i++) {

            System.out.printf("%d ", array[i]);

        }

    }

    private static void addElementToList() {
        list.add(new int[]{});
        list.add(new int[]{});
        list.add(new int[]{10, 12});
        list.add(new int[]{});
        list.add(new int[]{3, 3, 13});
        list.add(new int[]{3});
        list.add(new int[]{10});
        list.add(new int[]{0, 7});
    }

    public static int[] solve(int[][] lists) {
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < lists.length; i++) {
            if (lists[i].length > 0) {
                queue.offer(lists[i]);
            }
        }
        while (queue.size() > 1) {
            int[] t1 = queue.poll();
            int[] t2 = queue.poll();
            int _t1 = 0;
            int _t2 = 0;
            int _t3 = 0;
            int[] temp = new int[t1.length + t2.length];
            while (_t1 < t1.length && _t2 < t2.length) {
                if (t1[_t1] > t2[_t2])
                    temp[_t3++] = t2[_t2++];
                else
                    temp[_t3++] = t1[_t1++];
            }
            while (_t1 < t1.length) temp[_t3++] = t1[_t1++];
            while (_t2 < t2.length) temp[_t3++] = t2[_t2++];
            queue.offer(temp);
        }
        return queue.poll();
    }


}

