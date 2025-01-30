package array;

public class CountDuplicateElements {

    public static void main(String[] args) {

        // User input int array
        int[] array = { 2, 1, 2, 3, 4, 1, 2 };

        // Initializing count variable
        int count = 0;

        // Storing the length of the array
        int n = array.length;

        // Traverse through the loop to get each variable
        for (int i = 0; i < n; i++) {

            // Count the element initially
            count = 1;

            // Traverse through the loop again to compare the subsequent elements
            for (int j = i + 1; j < n; j++) {

                // Condition to compare with followed up logic to count and optimise
                if (array[i] == array[j]) {
                    count++;
                    array[j] = array[n - 1];
                    n--;
                    j--;
                }
            }

            // Check and print count from outer loop before traversing to next element
            if (count > 1) {
                System.out.println("Number " + array[i] + " count = " + count);
            }
        }
    }

}
