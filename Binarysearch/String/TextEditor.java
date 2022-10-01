package Binarysearch.String;

public class TextEditor {
    public static String solve(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1
                    && s.charAt(i) == '<' && s.charAt(i + 1) == '-') {
                if (sb.length() != 0)
                    sb.deleteCharAt(sb.length() - 1);
                i++;
            } else
                sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("<--"));
    }
}
