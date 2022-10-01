package QuickSort.PreviousExamples;

import java.util.List;

public class Sum {
    public static int sum(List<Integer> list, int i) {
        int sum = 0;
        if (i == list.size() - 1) return list.get(i);
        else return list.get(i) + sum(list, list.get(i + 1));
    }
}
