package Recursion.BackTracking;

public class ClusterManagement {
    public static boolean ok;
    public static boolean solve(int[] cores, int[] tasks){
        if(cores.length == 0 && tasks.length != 0) return false;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < cores.length; i++)
            sum1 += cores[i];
        for (int i = 0; i < tasks.length; i++)
            sum2 += tasks[i];
        if(sum1 < sum2) return false;
        return recursion(cores, tasks, 0, 0);
    }
    public static boolean recursion(int[] cores, int[] tasks,int i, int idx){
        if(idx == cores.length){
            if(i != tasks.length){
                ok = false;
                return ok;
            }
            else{
                ok = true;
                return ok;
            }
        }
        int j = i;
        int sum = 0;
        while(j < tasks.length){
            if(sum + tasks[j] <= cores[idx]){
                sum += tasks[j];
            }
            else{
                break;
            }
            j++;
        }
        recursion(cores,tasks,j,idx + 1);
        return ok;
    }
    public static void main(String[]args){
        System.out.println(solve(new int[]{}, new int[]{1}));
    }
}
