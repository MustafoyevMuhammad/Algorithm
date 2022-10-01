package Recursion.Stack;

import java.awt.geom.FlatteningPathIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberCombinationWithRecursionNotMine {
    public static String[] solve(String digits) {
        Map<Character,char[]> letters = new HashMap<>();
        letters.put('2', new char[]{'a', 'b', 'c'});
        letters.put('3', new char[]{'d', 'e', 'f'});
        letters.put('4', new char[]{'g', 'h', 'i'});
        letters.put('5', new char[]{'j', 'k', 'l'});
        letters.put('6', new char[]{'m', 'n', 'o'});
        letters.put('7', new char[]{'p', 'q', 'r', 's'});
        letters.put('8', new char[]{'t', 'u', 'v'});
        letters.put('9', new char[]{'w', 'x', 'y', 'z'});
        List<String> collector = new ArrayList<>();
        backtrack(digits, 0, letters, new StringBuilder(), collector);
        return collector.toArray(new String[collector.size()]);
    }

    private static void backtrack(String digits, int idx, Map<Character,char[]> letters,
                                  StringBuilder sb, List<String> collector) {
        if(idx == digits.length())
            collector.add(sb.toString());
        else {
            for (char c : letters.get(digits.charAt(idx))) {
                sb.append(c);
                backtrack(digits,idx + 1, letters, sb, collector);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = solve("46");
        for (String item : arr) {
            System.out.println(item);
        }
    }
}
