package SelectionSorted;

import java.util.Scanner;

public class AliBaba {
    private static int inCave = 0;
    private static int canTake = 0;
    private static int[] list;

    public static void main(String[] args) {
        readInput();
        selectionSort();
        sumOfGreaterThanZero();
    }

    private static void sumOfGreaterThanZero() {
        int sum = 0;
        for (int i = 0; i < canTake; i++) {
            if (list[i] > 0) sum += list[i];
        }
        System.out.println(sum);
    }

    public static void readInput() {
        Scanner sc = new Scanner(System.in);
        inCave = sc.nextInt();
        canTake = sc.nextInt();
        list = new int[inCave];
        for (int i = 0; i < inCave; i++) {
            list[i] = sc.nextInt();
        }
    }

    private static void selectionSort() {
        for (int i = 0; i < inCave; i++) {
            for (int j = i + 1; j < inCave; j++) {
                if (list[i] < list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
