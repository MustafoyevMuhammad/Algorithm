package Recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionWayToSimpleWay {
    private static List<Integer> arrayList;

    public static void main(String[] args) {
        ArrList();
        Suitcase suitcase = getSuitcase();
        printUptoKey(suitcase);
    }

    public static void printUptoKey(Suitcase mainBox) {
        if (mainBox != null) {
            System.out.println(mainBox.number);
            printUptoKey(mainBox.next);
        }
        else return;
    }

    private static Suitcase getSuitcase() {
        Suitcase suitcase = new Suitcase(arrayList.get(1));
        suitcase.next = new Suitcase(arrayList.get(2));
        suitcase.next.next = new Suitcase(arrayList.get(3));
        suitcase.next.next.next = new Suitcase(arrayList.get(4));
        return suitcase;
    }

    private static List<Integer> ArrList() {
        arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        return arrayList;
    }
}
