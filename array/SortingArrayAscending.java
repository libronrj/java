package array;

import java.util.Arrays;

public class SortingArrayAscending {

    public static void main(String[] args) {

        int[] array = { 12, 45, 23, 89, 75 };

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (i != j && array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }

}
