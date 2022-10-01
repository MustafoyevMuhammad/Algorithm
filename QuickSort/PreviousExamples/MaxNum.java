package QuickSort.PreviousExamples;

import java.util.ArrayList;
import java.util.List;

public class MaxNum {

    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(maxNumber(list,0, -999999999));
    }

    public static int maxNumber(List<Integer> list, int i, int max){
        if(i == list.size()) return max;
        else {
            if(max < list.get(i)) max = list.get(i);
            return  maxNumber(list, i + 1, max);
        }
    }

}
