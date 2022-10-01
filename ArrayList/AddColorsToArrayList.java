package Collection.ArrayList;

import java.util.*;

public class AddColorsToArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        }
        list.add(0, "Pink");
        System.out.println(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("input which index need to you");
        int index = sc.nextInt();
        System.out.println(list.get(index));
        System.out.println("please input which index to set");
        int setElement = sc.nextInt();
        list.set(setElement, "Space");
        System.out.println(list);
        System.out.println("remove third element");
        list.remove(3);
        System.out.println(list);
        System.out.println("Question: is there Red");
        if(list.contains("Red"))
            System.out.println("Yes");
        else
            System.out.println("No");
        Collections.sort(list);
        System.out.println("List after sorted");
        System.out.println(list);
    }
}
