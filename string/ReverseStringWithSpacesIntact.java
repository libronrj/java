public class ReverseStringWithSpacesIntact {

    public static void main(String[] args) {

        reverseStringWithSpaceIntact();

    }

    public static void reverseStringWithSpacesIntact() {
        String str = "I love my India";

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            if (str.charAt(i) == ' ')
                continue;

            reversedStr = reversedStr + str.charAt(i);
        }

        char[] array = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                array[i] = ' ';
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == ' ')
                continue;
            else {
                array[i] = reversedStr.charAt(j);
                j++;
            }
        }

        for (char c : array) {
            System.out.print(c);
        }

        System.out.println();
    }

    public static void reverseStringWithSpaceIntact() {

        String str = "Malayalam is a south indian language";
        String strWithoutSpaces = str.replace(" ", "");
        int length = strWithoutSpaces.length() - 1;

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ')
                result = result + " ";
            else {
                result = result + strWithoutSpaces.charAt(length);
                length--;
            }
        }

        System.out.println(result);
    }

}