package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExtractAPortion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list = list.subList(1,3);
        System.out.println(list);
    }
}
