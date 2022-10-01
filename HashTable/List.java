package HashTable;

import java.util.HashMap;
import java.util.Map;

public class List {
    public static void main(String[] args) {
        Map list = new HashMap();
        list.put("Apple", 0.67);
        list.put("milk", 1.49);
        list.put("Avocado", 1.49 +"$");
        System.out.println(list);
        if(list.containsKey("Avcado"))
            System.out.println(list.get("Avocado"));
    }
}
