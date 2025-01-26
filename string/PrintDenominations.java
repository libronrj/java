public class PrintDenominations {

    public static void main(String[] args) {

        // Store currency notes in an array
        int[] array = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

        // Input amount to get denomination
        int amount = 10564;

        // Count the number of notes for denomination
        int noOfNotes = 0;

        // Loop to traverse through the collection of currency
        for (int i = 0; i < array.length; i++) {

            noOfNotes = amount / array[i];
            amount = amount % array[i];

            // Condition to print the currency and notes required
            if (i < array.length && noOfNotes != 0)
                System.out.println(array[i] + " x " + noOfNotes);
        }
    }
}