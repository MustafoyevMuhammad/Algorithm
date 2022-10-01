package Recursion.java67;

import java.util.List;
import java.util.Scanner;

public class ReverseLinkedList {
    private static LinkedList list;
    private static LinkedList previous = null;
    private static LinkedList forward;

    public static void main(String[] args) {
        readInput();
        print();
//        reverseIterativaly();
        withRecursive(list);
        print();

    }

    private static void reverseIterativaly(){
        LinkedList current = list;
        LinkedList previous = null;
        LinkedList forward = null;
        while (current != null){
            forward = current.next;

            current.next = previous;
            previous = current;

            current = forward;
        }
        list = previous;

    }
    private static void withRecursive(LinkedList current){
        if(current != null){
            forward = current.next;

            current.next = previous;
            previous = current;

            current = forward;
            withRecursive(current);
        }
         list = previous;
    }

    private static void print(){
        LinkedList head = list;
        while (head != null){
            System.out.print(head.number+" ");
            head = head.next;
        }
        System.out.println();
    }

    private static void readInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number list of count");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.print("a[0] = ");
        a[0] = sc.nextInt();
        list = new LinkedList(a[0]);
        LinkedList temp = list;
        for (int i = 1; i < n; i++) {
            System.out.printf("a[%d] = ",i);
            a[i] = sc.nextInt();
            temp.next = new LinkedList(a[i]);
            temp = temp.next;
        }
    }
}

class LinkedList {
    LinkedList next;
    int number;

    public LinkedList(int n) {
        number = n;
        next = null;
    }
}
