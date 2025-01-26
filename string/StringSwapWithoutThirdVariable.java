public class StringSwapWithoutThirdVariable {
    public static void main(String[] args) {

        // User input for first String
        String s1 = "Ram";

        // User input for second String
        String s2 = "Shyam";

        // Concatenate both String
        s2 = s2 + s1;

        // s1 points to "Shyam" because now "Ram" in s2 i.e "RamShyam" has become null
        s1 = s2.replace(s1, "");

        // Print s1 that now points to "Shyam"
        System.out.println(s1);

        // s2 points to "Ram" because now "Shyam" in s2 i.e "RamShyam" has become null
        s2 = s2.replace(s1, "");

        // Print s2 that now points to Ram
        System.out.println(s2);
    }
}
