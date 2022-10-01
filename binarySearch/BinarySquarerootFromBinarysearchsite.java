package binarySearch;

public class BinarySquarerootFromBinarysearchsite {
    public static boolean solve(int n) {
        if(n==0)return true;
        boolean a=true;
        long start=0,end=n,mid;
        while(start<=end){
            mid=(start+end)>>1;
            if(mid*mid==n)return true;
            else if(mid*mid<n)start=mid+1;
            else end=mid-1;
        }
//        while(start!=end){
//            mid=(start+end)>>1;
//            if(mid*mid==n)return true;
//            else if(mid*mid<n)start=mid+1;
//            else if((Math.abs(start-end)==1)|| end==start && end*end!=n)return false;
//            else end=mid-1;
//            if(end<start)return false;
//
//        }
//        if(start==end && start*start==n)return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve(25));
    }
}
