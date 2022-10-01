package Recursion;

import java.util.*;

public class UpsideDownNumber {
    private static Map<String,String> map;
    private static String[] helperForOddN= {"0","1","8"};
    private static String[] helperForEverything={"0","1","6","8","9"};
    private static String[] helperForFirstDigit={"1","6","8","9"};
    private static String[] temp;
    private static int forArr = 0;
    private static String[] need;

    public static String[] solve(int n, int len){
        map =new HashMap<>();
        map.put("0","0");
        map.put("1","1");
        map.put("6","9");
        map.put("8","8");
        map.put("9","6");
        temp =new String[len];
        trying(len, n);
        return composeArray(n, len);
    }
    public static String[] trying(int len, int n){
        int k = 0;
        need = new String[len];
        temp = new String[n];
            while(k<4){
                temp[0] = helperForFirstDigit[k];
                temp[n - 1] = map.get(helperForFirstDigit[k]);
                recursion(n,1);

                k++;
            }


        return temp;
    }
    public static void recursion(int n, int i){
        int t = 0;
        String a="";
        if(i < n / 2){
            while(t<5){
                    temp[i] = helperForEverything[t];
                    temp[n - i - 1] = map.get(temp[i]);
                    recursion(n , i + 1);
                for (int j = 0; j < temp.length; j++) {
                    a+=temp[j];
                }
                need[forArr++]=a;
                t++;

            }
        }
        else {

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(),len = 1;
        if(n == 1)len = 3;
        else if(n == 2)len = 4;
        else if(n % 2 != 0){
            len = 4;
            for (int i = 1; i < n / 2; i++) {
                len *= 5;
            }
            len *= 3;
        }
        else if(n % 2 ==0){
            len=4;
            for (int i = 1; i < n / 2; i++) {
                len *=5;
            }
        }
        map =new HashMap<>();
        map.put("0","0");
        map.put("1","1");
        map.put("6","9");
        map.put("8","8");
        map.put("9","6");
        trying(len,n);
//        System.out.println(Arrays.toString(solve(12,len)));
    }

    private static String[] composeArray(int n, int len) {
        List arrayList=new ArrayList();
        String a = "";String temp[] =new String[n];
        if(n % 2 == 0){
            int k = 1;
            while(k < 5) {
                temp=new String[n];
                temp[0] = helperForEverything[k];
                temp[n-1]=map.get(temp[0]);
                if(n>2) for (int z = 0; z < 5; z++) {
                    for (int i = 1; i < n/2; i++) {
                        temp[i] = helperForEverything[z];
                        temp[n - i - 1] = map.get(helperForEverything[z]);

                    }for (int c = 0; c < temp.length; c++) {
                        a += temp[c];
                    }
                    arrayList.add(a);
                    a = "";
                }

                k++;
            }
        }
        String returnArr[]=new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            returnArr[i]=arrayList.get(i)+"";
        }
        return returnArr;
    }
}
