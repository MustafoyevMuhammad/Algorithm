package Recursion;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

public class SimpleWay {
    private static List<Integer> arrayList;
    public static void main(String[] args) {
        ArrList();
        Suitcase suitcase = getSuitcase();
        Suitcase mainBox = suitcase;
        printUptoKey(mainBox);
    }

    private static void printUptoKey(Suitcase mainBox) {
        while (mainBox != null){
            System.out.println(mainBox.number);
            mainBox = mainBox.next;
        }
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

class Suitcase {
    Suitcase next;
    int number;

    public Suitcase(int number) {
        this.number = number;
        next = null;
    }
}