public class PrintDenominations {

    public static void main(String[] args) {

        int[] array = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

        int amount = 5000;
        int quotient = 0;

        for (int i = 0; i < array.length; i++) {

            quotient = amount / array[i];
            amount = amount % array[i];

            if (i < array.length && quotient != 0)
                System.out.println(array[i] + " x " + quotient);
        }
    }
}