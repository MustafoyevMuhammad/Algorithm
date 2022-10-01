package Collection.LInkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class WithIteration {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<>();
        lList.add("Hi");
        lList.add("Hello");
        lList.add("Welcome");
        lList.add("Salam");
        Iterator it = lList.listIterator(0);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
