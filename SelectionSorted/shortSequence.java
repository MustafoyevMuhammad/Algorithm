package SelectionSorted;

import java.util.Scanner;

public class shortSequence {
    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(findPosition(n));
    }
    public static String findPosition(int n){

        int z=1;
        String s="",ss="1";
        while(s.length()<n){
            s+=ss;
            ss+=(++z);
        }
        return s.charAt(n-1)+"";
    }
}
