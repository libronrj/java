package array;

import java.util.ArrayList;
import java.util.List;

public class ListContinuousRange {

    public static void main(String[] args) {

        int[] array = { 0, 2, 3, 4, 6, 8, 9 };
        List<String> result = listContinuousRange(array);
        System.out.println(result);

    }

    public static List<String> listContinuousRange(int[] array) {

        List<String> list = new ArrayList<>();

        int n = array.length;

        int start = 0;
        int end = 0;

        for (int i = 0; i < n - 1; i++) {

            start = array[i];

            for (int j = i + 1; j < n; j++) {

                end = array[j];

                if (i == 0 && start + 1 != end)
                    list.add("" + start);
                else if (start + 1 == end)
                    continue;
                else
                    list.add("" + start + "->" + end);

            }
        }
        return list;
    }

}
