public class RearrangeElementsToCreateLargestNumber {

    public static void main(String[] args) {

        // User input array
        int[] array = { 99, 24, 31, 78, 85 };

        // Method invocation
        int[] rearrangedArray = rearrangeElementsToCreateLargestNumber(array);

        // Loop to print the rearranged array
        for (int num : rearrangedArray)
            System.out.print(num);

    }

    // Method to rearrange array and return the array
    public static int[] rearrangeElementsToCreateLargestNumber(int[] array) {

        // Loop to traverse across the loop and verify each element
        for (int i = 0; i < array.length; i++) {

            // Loop to traverse linearly and compare subsequent elements
            for (int j = i + 1; j < array.length; j++) {

                // Concat value of i and j
                String ij = "" + array[i] + array[j];

                // Concat value of j and i
                String ji = "" + array[j] + array[i];

                // Compare value of ij with ji and rearrange each element
                if (ij.compareTo(ji) < 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }
}
