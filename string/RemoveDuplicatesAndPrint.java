public class RemoveDuplicatesAndPrint {

    public static void main(String[] args) {

        String str = "ram and Shyam are fRiends";
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length() - 1; i++) {

            char ch = sb.charAt(i);

            for (int j = i + 1; j < sb.length(); j++) {

                if (Character.toLowerCase(ch) == Character.toLowerCase(sb.charAt(j)) && ch != ' ')
                    sb.deleteCharAt(j);
            }
        }
        System.out.println(sb);
    }
}
