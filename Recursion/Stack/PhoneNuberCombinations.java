package Recursion.Stack;

public class PhoneNuberCombinations {
    static String[][] temp ={{"a", "b", "c"}, {"d", "e", "f"},
            {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"},
            {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};
    static int n = 1;
    static int index = 0;

    public static String[] solve(String digits){
        findLengthOfArray(digits);
        String[] arr = new String[n];
        char[] chdigits = digits.toCharArray();
        return recursion(0, digits, arr);
    }

    public static String[] recursion(int i, String digits, String[] arr){
        if(i == n - 1){
            return new String[]{temp[i][temp[i].length - 1]};
        }
        else{
            int k = digits.charAt(i) - 50;
            for (String item : temp[k]) {
                if(i < digits.length()){
                    arr[index++] = item + recursion(i++, digits, arr);
                }
            }
        }
        return arr;
    }

    private static void findLengthOfArray(String digits) {
        for (int i = 0; i < digits.length(); i++) {
            if(digits.charAt(i) - 48 == 9 || digits.charAt(i) - 48 == 7)
                n *= 4;
            else
                n *= 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(solve("237"));
    }
}
