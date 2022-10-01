package Collection.LInkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class WithReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Hi");
        lList.add("Hello");
        lList.add("Welcome");
        lList.add("Salam");
        Iterator iterator = lList.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
