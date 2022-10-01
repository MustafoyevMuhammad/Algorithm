package binarySearch;

public class squareRootWithoutAnyerator
{
    public static int squareRoot(int n){
        long start=0,end=n,mid=0;
        while(start<=end){
            mid=(start+end)>>1;
            if(mid*mid==n)return (int)mid;
            else if(mid*mid>n)end=mid-1;
            else start=mid+1;
        }

        return (int)end;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(38198110));
    }
}
