package Collection.LInkedList;

import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Hi");
        lList.add("Hello");
        lList.add("Welcome");
        System.out.println(lList);
        for (String element : lList) {
            System.out.println(element);
        }
    }
}
