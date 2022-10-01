package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CopylistFromAnotherList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        System.out.println(list1);//[1, 2, 3, 4, 5]
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        System.out.println(list2);//[A, B, C, D]
        Collections.copy(list1,list2);
        System.out.println("After copying process");
        System.out.println(list1);//[A, B, C, D, 5]
        System.out.println(list2);//[A, B, C, D]
        System.out.println("shuffling array");
        Collections.shuffle(list1);
        System.out.println(list1);
        Collections.reverse(list2);
        System.out.println(list2);

    }
}