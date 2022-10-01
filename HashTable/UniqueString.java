package HashTable;

import java.util.HashMap;
import java.util.Map;

public class UniqueString {
    public static boolean solve(String s){
        if(s.length() == 0) return true;
        String a = "abcdefghijklmnopqrstuvwxyz";
        Map map = new HashMap();
        boolean ok = true;
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i)) && a.contains(s.charAt(i) +""))
                map.put(s.charAt(i),1);
            else {
                ok = false;
                break;
            }
        }
        return ok;
    }

    public static void main(String[] args) {
        System.out.println(solve("cg"));
    }
}
