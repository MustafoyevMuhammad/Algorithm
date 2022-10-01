package QuickSort.DivideAndConquer;

import java.util.ArrayList;
import java.util.List;

public class MergingKSortedList {
    public static int[] solve(int[][]lists){
        List<int[]> arrayList = new ArrayList<>();
        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            if(lists[i].length >= 1){
                arrayList.add(lists[i]);
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            int k = arrayList.get(i).length, s = 0;
            while(s < k){
                arrList.add(arrayList.get(i)[s]);
                s++;
            }
            System.out.println();
        }
        arrList = quickSort(arrList);
        int[] a = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            a[i] = arrList.get(i);
        }
        return a;
    }
    public static List<Integer> quickSort(List<Integer> array) {

        List<Integer> smallestArray = new ArrayList<>();
        List<Integer> greatestArray = new ArrayList<>();
        if (array.size() <= 1) return array;
        else {
            int pivot = array.get(array.size() / 2);
            for (int i = 0; i < array.size(); i++) {
                if (i == array.size() / 2) {
                } else if (pivot > array.get(i)) smallestArray.add(array.get(i));
                else greatestArray.add(array.get(i));
            }
            List<Integer> arr = new ArrayList<>();
            arr.addAll(quickSort(smallestArray));
            arr.add(pivot);
            arr.addAll(quickSort(greatestArray));
            return arr;
        }
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
        System.out.println(solve(list.toArray(new int[8][])));
    }
}
