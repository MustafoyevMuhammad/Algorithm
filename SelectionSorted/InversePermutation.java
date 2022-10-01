package SelectionSorted;
import java.util.Arrays;
import java.util.Scanner;

public class InversePermutation {
    public static int[] InversepermutationWithSElectioSorted(int[]arr){
        int []arr2=new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i+1==arr[j])arr2[i]=j+1;
            }
        }
        return arr2;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
//        int[]arr2=new int[n];
//        for (int i = 0; i <n ; i++)
//            arr2[arr[i]-1]=i+1;
//        for (int i = 0; i <n ; i++) {
//            System.out.println(arr2[i]);
//        }
        arr=InversepermutationWithSElectioSorted(arr);

        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }
}
