package Collection.ArrayList;

import java.util.ArrayList;

public class TrimToSize {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Red");
        arrList.add("Green");
        arrList.add("Black");
        arrList.add("White");
        arrList.add("Pink");
        System.out.println(arrList.size());
        arrList.trimToSize();
        System.out.println(arrList.size());

    }
}
