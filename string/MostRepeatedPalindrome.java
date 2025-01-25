public class MostRepeatedPalindrome {
    public static void main(String[] args) {

        String str = "Mom dad and children mom mom child mom dad dad child children dad dad";

        String[] strArray = str.split(" ");
        int n = strArray.length;
        int count1 = 0;
        String word = "";

        for (int i = 0; i < n; i++) {
            int count2 = 1;
            for (int j = i + 1; j < n; j++) {

                String reversedString = new StringBuilder(strArray[j]).reverse().toString();

                if (strArray[i].equalsIgnoreCase(reversedString)) {
                    count2++;
                    strArray[j] = strArray[n - 1];
                    n--;
                    j--;
                }
                if (count2 > count1) {
                    word = strArray[i];
                    count1 = count2;
                }
            }
            if (count2 > 1) {
                System.out.println(strArray[i] + " occurs " + count2 + " times");
            }
        }
        System.out.println(word + " : " + count1);
    }
}