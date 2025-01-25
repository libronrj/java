import java.util.Map;
import java.util.HashMap;

public class PrintAlphabetsAndOccurence {

    public static void main(String[] args) {

        String str = "aaaabbbccd";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

        // Print alphabet then number
        map.forEach((key, value) -> System.out.print(key + "" + value));
        System.out.println();
        // Print number then alphabet
        map.forEach((key, value) -> System.out.print(value + "" + key));
        System.out.println();
    }

}