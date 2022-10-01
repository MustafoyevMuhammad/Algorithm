package Recursion.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {
    static List<String> one = null;
    static List<String> zero = null;

    public static List<String> findStrobogrammatic(int n) {
        //n =1 : 0,1,8
        //n =2 : 11,69,88,96,00
        //n =3 : 101,111,181,609,619,689,808,818,888,906,916,986 (000)
        //n =4 : 1111,6119,8119,9116, ...
        String[] array1 = {"0","1","8"};
        one = Arrays.asList(array1);
        zero = new ArrayList<>();
        zero.add("");
        List<String> res =  findStroboNumberHelper(n,n);
        return res;
    }

    static List<String> findStroboNumberHelper(int n, int target){
        if ( n == 0){
            return zero;
        } else if ( n == 1) {
            return one;
        }
        List<String> result = new ArrayList<>();
        List<String> subResult = findStroboNumberHelper(n-2,target);
        for( String elt : subResult ){
            if ( n != target ){
                result.add("0"+elt+"0");
            }
            result.add("1"+elt+"1");
            result.add("6"+elt+"9");
            result.add("8"+elt+"8");
            result.add("9"+elt+"6");
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List list= findStrobogrammatic(n);
        String[] a = ListTransfertoArray(n, list);
        System.out.println(Arrays.toString(a));
    }

    private static String[] ListTransfertoArray(int n, List list) {
        String []a =new String[list.size()];
        if(n == 0) return new String[0];
        List Sorted = (List) list.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            a[i] = "" + Sorted.get(i);
        }
        return a;
    }
}
