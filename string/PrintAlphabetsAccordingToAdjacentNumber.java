public class PrintAlphabetsAccordingToAdjacentNumber {
    public static void main(String[] args) {

        // Input String
        String str = "a10b6c23";

        // Initialize the char with null value
        char alphabet = '\0';

        // StringBuilder type to store the entire number by appending each number
        StringBuilder concatNumber = new StringBuilder();

        // StringBuilder type object to append the alphabet
        StringBuilder sb = new StringBuilder();

        // Loop to traverse the String
        for (int i = 0; i < str.length(); i++) {

            // Storing the character by index for conditional check
            char ch = str.charAt(i);

            // Conditional check if character is an alphabet
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                // Condition to check if concatNumber has a length
                if (concatNumber.length() > 0) {

                    // Convert concatNumber variable to String and parse to Integer
                    int n = Integer.parseInt(concatNumber.toString());

                    // Loop to append the last alphabet equal to the adjacent number
                    for (int j = 0; j < n; j++) {
                        sb.append(alphabet);
                    }
                }

                // Store the alphabet in the identifier alphabet
                alphabet = ch;

                // Set concatNumber length to 0 for next use
                concatNumber.setLength(0);

                // Conditional check if character is a number and appending
            } else if (ch >= '0' && ch <= '9') {
                concatNumber.append(str.charAt(i));
            }
        }

        // Loop to append the last character according to adjacent number
        for (int i = 0; i < Integer.parseInt(concatNumber.toString()); i++) {
            sb.append(alphabet);
        }

        System.out.println(sb);
    }
}
