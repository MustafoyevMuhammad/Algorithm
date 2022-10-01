package Recursion.Stack;


import Recursion.java67.PreOrderAndPostOrder;
import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class OverChoice {
    private static TreeSet<String> list;

    public static void main(String[] args) {
        String[] a = solve("[a|b]with[x|y|z]]");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static String[] solve(String s) {
        s = s.replace("[", "");
        s = s.replace("]", "");
        s = s.replace("with", "@");
        s = s.replace("|", "#");
        String[] a = s.split("@");
        list = new TreeSet<String>();
        if (a.length == 1) {
            String[] k = a[0].split("#");
            return k;
        }
        for (int i = 0; i < a.length - 1; i++) {
            String[] m = a[i].split("#");
            String[] n = a[i + 1].split("#");
            recursive(m, n);
        }
        String[] str = new String[list.size()];
        int i = 0;
        for (String str1 : list) {
            str[i++] = str1;
        }

        return str;
    }

    public static TreeSet recursive(String[] a, String[] b) {
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < b.length; k++) {
                list.add(a[j] + "with" + b[k]);
            }
        }
        return list;
    }


}
