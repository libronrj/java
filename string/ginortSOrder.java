import java.util.Arrays;

/* Order the String in an order where lowercase alphabets should be displayed first in ascending order, then
    uppercase alphabets in ascending order followed by odd numbers in ascending order and finally even numbers
    in ascending order...
*/

public class ginortSOrder {

    public static void main(String[] args) {

        // Input String
        String inputString = "Sorting4321";

        // Convert String to char array
        char[] array = inputString.toCharArray();

        // Used Arrays utility class to sort the array
        Arrays.sort(array);

        // Four different StringBuilder to append and store characters based on logic
        StringBuilder lowercase = new StringBuilder();
        StringBuilder uppercase = new StringBuilder();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        // Traverse the sorted array
        for (char ch : array) {
            if (ch >= 'a' && ch <= 'z') // Condition to append lowercase characters
                lowercase.append(ch);
            else if (ch >= 'A' && ch <= 'Z') // Condition to append uppercase characters
                uppercase.append(ch);
            else if (ch >= '0' && ch <= '9' && ch % 2 == 0) // Condition to append even digit characters
                even.append(ch);
            else if (ch >= '0' && ch <= '9' && ch % 2 == 1) // Condition to append odd digit characters
                odd.append(ch);
        }

        // Print the final result
        System.out.println(lowercase + "" + uppercase + odd + even);

    }

}
