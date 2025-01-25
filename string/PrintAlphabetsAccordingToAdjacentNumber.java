// Only valid if the numbers are single digit
public class PrintAlphabetsAccordingToAdjacentNumber {
    public static void main(String[] args) {

        // Input String
        String str = "a10b6c23";

        int index = 0;
        StringBuilder concatNumber = new StringBuilder();
        boolean flag = false;

        StringBuilder sb = new StringBuilder();

        // Loop to traverse the String
        for (int i = 0; i < str.length(); i++) {

            // Store the character index to conditionally check
            char ch = str.charAt(i);

            // Conditional check of each character stored on variable ch
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                index = i;
                // Skipping the loop if the character is an alphabet irrespective of case
                continue;
                // Conditional check to compare character to any number
            } else if (ch >= '0' && ch <= '9') {
                concatNumber.append(ch);

                if ((i != str.length() - 1) && ((str.charAt(i + 1) >= 'a' && str.charAt(i + 1) <= 'z')
                        || (str.charAt(i + 1) >= 'A' && str.charAt(i + 1) <= 'Z'))) {

                    flag = true;
                } else if (i == str.length() - 1)
                    flag = true;
            }

            if (flag) {
                int n = Integer.parseInt(concatNumber.toString());
                for (int j = 0; j < n; j++)
                    sb.append(str.charAt(index));

                flag = false;
                concatNumber = new StringBuilder();
            }
        }

        // Print the new String
        System.out.println(sb);
    }
}
