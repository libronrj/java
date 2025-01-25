// This program finds the number of palindromes in a String and prints the word with max occurence
public class MostRepeatedPalindrome {
    public static void main(String[] args) {

        // Input String to process
        String str = "Mom dad and children mom mom child mom dad dad child children dad dad";

        // Split the String into an array of words
        String[] strArray = str.split(" ");

        int n = strArray.length;

        // To store the count of the most frequent word
        int maxCount = 0;

        // To store the word with the maximum occurrences
        String maxWord = "";

        // Loop through the array to check each word
        for (int i = 0; i < n; i++) {

            // Count the occurrences of the current word
            int currentCount = 1;

            // Inner loop to compare the current word with the remaining words
            for (int j = i + 1; j < n; j++) {

                // Reverse the word to check if it's a palindrome using StringBuilder class
                String reversedString = new StringBuilder(strArray[j]).reverse().toString();

                // If it matches (ignoring case), count it and adjust the array to skip further
                // duplicates
                if (strArray[i].equalsIgnoreCase(reversedString)) {
                    currentCount++;
                    strArray[j] = strArray[n - 1];
                    n--;
                    j--;
                }
            }

            // Update the maximum count and the corresponding word
            if (currentCount > maxCount) {
                maxWord = strArray[i];
                maxCount = currentCount;
            }

            // Print each palindrome and its occurrence count if it appeared more than once
            if (currentCount > 1) {
                System.out.println(strArray[i] + " occurs " + currentCount + " times");
            }
        }

        // Print the word with the highest occurrence
        System.out.println("Word with maximum occurence: " + maxWord + " - " + maxCount);
    }
}