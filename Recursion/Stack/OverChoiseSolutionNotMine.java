package Recursion.Stack;

import java.util.ArrayList;
import java.util.List;

public class OverChoiseSolutionNotMine {

    public static void main(String[] args) {
        String[] k = solve("[a|b]with[x|y|z]");
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
    }

    public static String[] solve(String s) {
        List<String[]> wordGroups = createWordGroups(s);
        List<String> collector = new ArrayList<>();

        backtrack(wordGroups, 0, collector, new StringBuilder());
        return collector.toArray(new String[collector.size()]);
    }

    private static List<String[]> createWordGroups(String s) {
        List<String[]> wordGroups = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int start = i;
            if (s.charAt(start) == '[') {
                while (s.charAt(start) != ']') start++;

                String splittable = s.substring(i + 1, start);
                wordGroups.add(splittable.split("\\|"));
                i = start + 1;
            } else {
                while (start < s.length() && Character.isLetter(s.charAt(start))) start++;
                wordGroups.add(new String[]{s.substring(i, start)});
                i = start;
            }
        }
        return wordGroups;
    }

    private static void backtrack(
            List<String[]> wordGroups, int idx,
            List<String> collector, StringBuilder sb) {
        if (idx == wordGroups.size()) {
            collector.add(sb.toString());
        } else {
            for (String word : wordGroups.get(idx)) {
                sb.append(word);
                backtrack(wordGroups, idx + 1, collector, sb);
                sb.delete(sb.length() - word.length(), sb.length());
            }
        }
    }


}
