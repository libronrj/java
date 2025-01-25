// Only valid if the numbers are single digit
public class PrintAlphabetsAccordingToAdjacentNumber {
    public static void main(String[] args) {

        String str = "a3b4c2";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                continue;
            } else if (ch >= '0' && ch <= '9') {

                int n = Integer.parseInt("" + ch);
                for (int j = 0; j < n; j++) {
                    sb.append("" + str.charAt(i - 1));
                }
            }
        }

        System.out.println(sb);
    }
}
