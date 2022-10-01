package QuickSort.DivideAndConquer;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergingKSortedLIstNotMine {
    public static int[] solve(int[][] lists) {
        if (lists.length == 0) return new int[0];
        int size = 0;
        PriorityQueue<Tuple> pq =
                new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
        for (int i = 0; i < lists.length; i++) {
            if(lists[i].length > 0){
                pq.add(new Tuple(i,0,lists[i][0]));
                size += lists[i].length;
            }
        }
        int[] result = new int[size];
        int index = 0;
        while (!pq.isEmpty()){
            Tuple t = pq.poll();
            result[index++] = t.val;
            if(t.col + 1 < lists[t.row].length){
                pq.add(new Tuple(t.row,t.col + 1, lists[t.row][t.col + 1]));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{});
        list.add(new int[]{});
        list.add(new int[]{10, 12});
        list.add(new int[]{});
        list.add(new int[]{3, 3, 13});
        list.add(new int[]{3});
        list.add(new int[]{10});
        list.add(new int[]{0, 7});
        int [] array = solve(list.toArray(new int[8][]));
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }
    }
}

class Tuple {
    int row, col, val;

    public Tuple(int row, int col, int val) {
        this.row = row;
        this.col = col;
        this.val = val;
    }
}
