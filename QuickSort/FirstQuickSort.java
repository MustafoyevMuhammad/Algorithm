package QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstQuickSort {

    public static List<Integer> quickSort(List<Integer> array){

        List<Integer> smallestArray = new ArrayList<>();
        List<Integer> greatestArray = new ArrayList<>();
        if(array.size() <= 1) return array;
        else{
            int pivot = array.get(array.size()/2);
            for (int i = 0; i < array.size(); i++) {
                if(i == array.size()/2){}
                else if(pivot > array.get(i)) smallestArray.add(array.get(i));
                else greatestArray.add(array.get(i));
            }
            List<Integer> arr =new ArrayList<>();
            arr.addAll(quickSort(smallestArray));
            arr.add(pivot);
            arr.addAll(quickSort(greatestArray));
            return arr;
        }
    }

    public static void main(String[] args) {
        List<Integer> list =new ArrayList();
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(90);
        list.add(6);
        list.add(4);
        System.out.println(quickSort(list));
    }
}
