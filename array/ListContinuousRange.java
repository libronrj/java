package array;

import java.util.ArrayList;
import java.util.List;

public class ListContinuousRange {

    public static void main(String[] args) {
        int[] array = { 0, 1, 3, 4, 6, 8, 9 };
        List<String> result = listContinuousRange(array);
        System.out.println(result);
    }

    public static List<String> listContinuousRange(int[] array) {
        List<String> list = new ArrayList<>();

        if (array == null || array.length == 0)
            return list;

        int start = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1] + 1) { // If not consecutive, close the range
                addRange(list, start, array[i - 1]);
                start = array[i]; // Start new range
            }
        }

        // Add the last range
        addRange(list, start, array[array.length - 1]);

        return list;
    }

    private static void addRange(List<String> list, int start, int end) {
        if (start == end) {
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + end);
        }
    }
}
