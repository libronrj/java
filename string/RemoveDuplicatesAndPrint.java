public class RemoveDuplicatesAndPrint {

    public static void main(String[] args) {

        // User input String
        String str = "ram and Shyam are fRiends";

        // Converted immutable String to mutable using StringBuilder class
        StringBuilder sb = new StringBuilder(str);

        // Loop to traverse the String and compare element one by one
        for (int i = 0; i < sb.length() - 1; i++) {

            // Store character on ch identifier for comparison
            char ch = sb.charAt(i);

            // Loop to traverse through the subsequent elements
            for (int j = i + 1; j < sb.length(); j++) {

                // Condition to delete character if repeated and secure the spaces
                if (Character.toLowerCase(ch) == Character.toLowerCase(sb.charAt(j)) && ch != ' ')
                    sb.deleteCharAt(j);
            }
        }
        System.out.println(sb);
    }
}
