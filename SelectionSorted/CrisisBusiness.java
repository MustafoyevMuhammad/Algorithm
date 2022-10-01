package SelectionSorted;

import java.util.Scanner;

public class CrisisBusiness {
    public static int numberMaxCars(int amount, int[] arrayList) {
        selectionSort(arrayList);
        int sum = 0, i = 0;
        while (sum < amount) {
            sum += arrayList[i++];
        }
        if (sum > amount)
            return i - 1;
        return i;
    }

    private static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amount = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println(numberMaxCars(amount, list));
    }
}
