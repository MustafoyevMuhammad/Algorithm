package Recursion.Stack;

import java.util.*;

public class PhoneNumberCombinationNotMine {
    public static String[] solve(String digits) {
        if(digits.length() == 0) return new String[]{};
        Queue<String> q = new LinkedList<>();
        List<String> list = new ArrayList<>();
        Map<Character,String> letter = Map.of('2', "abc", '3', "def",
                '4', "ghi", '5', "jkl", '6', "mno",
                '7', "pqrs", '8', "tuv", '9', "wxyz");
        String a = letter.get(digits.charAt(0));
        for (char c : a.toCharArray()) {
            q.add(Character.toString(c));
        }
        for (int i = 1; i < digits.length(); i++) {
            int currentSize = q.size();
            for (int j = 0; j < currentSize; j++) {
                String top = q.poll();
                String append = letter.get(digits.charAt(i));
                for (char c : append.toCharArray()) {
                    String str = top + Character.toString(c);
                    q.add(str);
                }
            }
        }
        String[] arr = new String[q.size()];
        int k = 0;
        while(!q.isEmpty()){
            arr[k++] = q.poll();
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] arr = solve("25");
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
