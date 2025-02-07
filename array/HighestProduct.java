package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestProduct {

    public static void main(String[] args) {

        int[] arr = { 0, -10, 1, 3, 2 };

        List<Integer> list = new ArrayList<>();
        int product = 1;
        for (int i = 0; i < arr.length - 2; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {
                    product = arr[i] * arr[j] * arr[k];
                    list.add(product);
                }
            }

        }
        Collections.sort(list);
        System.out.println(list);
    }

}
