package QuickSort.PreviousExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountOfNumberTheList {
    public static int count(List list,int i){
        if(list.isEmpty()) return 0;
        else {
            list.remove(0);
            return count(list,i + 1) + 1;
        }
    }

    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(count(list,0));
    }
}
