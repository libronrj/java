public class PrintSubString {
    public static void main(String[] args) {
        // Take user input
        String str = "Before 6 a.m (66789abcv), meet me";

        // Extract partial string from existing string using substring() and indexOf()
        String newStr = str.substring(str.indexOf("(") + 1, str.indexOf(")"));

        System.out.println(newStr);
    }
}
