package Collection.ArrayList;

import java.util.ArrayList;

public class EnsureCapacity {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        //Increasing capacity 6
        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        c1.set(0,"Blue");
        System.out.println(c1);

    }
}
