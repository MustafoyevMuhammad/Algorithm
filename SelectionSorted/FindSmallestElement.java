package SelectionSorted;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSmallestElement {
    public static int findsmallestelemnt(int[]arr){
        int smallest=999999999;
        for (int i = 0; i < arr.length; i++) {
            if (smallest>arr[i]) {
                smallest=arr[i];
            }
        }return smallest;
    }

    public static void main(String[] args) {
        int[]arr={1,4,7,0,-9,99};
        System.out.println(findsmallestelemnt(arr));
        System.out.println(Arrays.toString(find_sorted(arr)));
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);list.add(4);list.add(7);list.add(0);list.add(-9);list.add(99);
        list=find_with_ArrayLIst(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("["+list.get(i)+"] ");
        }
    }
    public static int []find_sorted(int []arr){

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static ArrayList<Integer> find_with_ArrayLIst(ArrayList<Integer>arr){

        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <arr.size() ; i++) {
            int smal=findSmallestEleWithArrayList(arr);
            if(smal==arr.get(i)){
                list.add(arr.get(i));
                arr.remove(i);
                i=-1;
            }

        }
        return list;
    }
    public static int findSmallestEleWithArrayList(ArrayList<Integer>arr){
        int small=999999999;
        for (int i = 0; i < arr.size(); i++) {
            if(small>arr.get(i)){
                small=arr.get(i);
            }
        }
        return small;
    }
}
