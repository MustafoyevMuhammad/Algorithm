package SelectionSorted;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class TimeSorting {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            int h=sc.nextInt(),m=sc.nextInt(),s=sc.nextInt();
            arr[i]=h*3600+m*60+s;
        }
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i <n ; i++) {
            int h=arr[i]/3600,m=(arr[i]-h*3600)/60,s=arr[i]-h*3600-m*60;
            System.out.println(h+" "+m+" "+s);

        }
    }

}
