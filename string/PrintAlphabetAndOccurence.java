import java.util.Map;
import java.util.HashMap;

public class PrintAlphabetAndOccurence {

    public static void main(String[] args) {

        String str = "aaaabbbccd";

        Map<Character, Integer> map = new HashMap<>();

        // Count the occurence as store te value for each key where key is the character
        for (int i = 0; i < str.length(); i++)
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

        // Print alphabet then number using lambda expression
        map.forEach((key, value) -> System.out.print(key + "" + value));
        System.out.println();

        // Print number then alphabet using lambda expression
        map.forEach((key, value) -> System.out.print(value + "" + key));
        System.out.println();
    }

}