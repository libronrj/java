public class ReverseWordAndPrint {
    public static void main(String[] args) {

        // User input String value
        String str = "My name is Libron";

        // Converted the String into a String Array
        String[] strArray = str.split(" ");

        // Selecting value on the array index to reverse using StringBuilder class
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = new StringBuilder(strArray[i]).reverse().toString();
        }

        // Print each reversed value from the String array
        for (String reversedWord : strArray)
            System.out.print(reversedWord + " ");

        System.out.println();
    }
}