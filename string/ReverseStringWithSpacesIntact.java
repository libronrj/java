public class ReverseStringWithSpacesIntact {

    public static void main(String[] args) {

        // User input of the String
        String str = "I Love My India";

        // StringBuilder class to reverse the String and store in reverse identifier
        String reverse = new StringBuilder(str).reverse().toString();

        // Loop to traverse the String
        for (int i = 0; i < str.length(); i++) {

            // Condition to print preserved space concatenated with next character
            if (str.charAt(i) == ' ')
                System.out.print(" " + reverse.charAt(i));
            else
                System.out.print(reverse.charAt(i)); // Print the character without checking space
        }
        System.out.println();
    }
}