public class PrintMaxLengthPalindrome {

    public static void main(String[] args) {

        String str = "swertstaff stfafts stfwfts sbdcffestss ssfsfss abcdedcba";

        // Split String into an array of String
        String[] array = str.split(" ");

        // Store temporary length of each word
        int tempLength = 0;

        // Store the length of the largest palindrome word
        int length = 0;

        // Store the longest palindrome
        String longestPalindrome = "";

        // Loop to traverse through the array
        for (int i = 0; i < array.length; i++) {

            // Reverse each word to compare and check for palindrome
            StringBuilder word = new StringBuilder(array[i]).reverse();

            // Store length of each word if palindrome
            if (array[i].equalsIgnoreCase(word.toString()))
                tempLength = array[i].length();

            // Store final length based on condition and the word
            if (tempLength > length) {
                length = tempLength;
                longestPalindrome = array[i];
            }
        }

        System.out.println(longestPalindrome + ": " + length);
    }
}
