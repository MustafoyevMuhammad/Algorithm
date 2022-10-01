package Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        ArrayList<String> CloneList = (ArrayList<String>) list.clone();
        CloneList.add("3");
        System.out.println(list);
        System.out.println(CloneList);
    }
}
