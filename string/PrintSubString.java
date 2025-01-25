public class PrintSubString {
    public static void main(String[] args) {

        String str = "Before 6 a.m (66789abcv), meet me";
        String newStr = str.substring(str.indexOf("(") + 1, str.indexOf(")"));
        System.out.println(newStr);
    }
}
