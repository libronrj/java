public class StringSwapWithoutThirdVariable {
    public static void main(String[] args) {

        String s1 = "Ram";
        String s2 = "Shyam";

        s2 = s2 + s1;

        s1 = s2.replace(s1, "");
        System.out.println(s1);
        s2 = s2.replace(s1, "");
        System.out.println(s2);
    }
}
