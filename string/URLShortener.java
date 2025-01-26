public class URLShortener {
    public static void main(String[] args) {

        // String to append and shorten the int number
        String representation = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // StringBuilder class to append the character based on remainder
        StringBuilder sb = new StringBuilder();

        // User input of URL
        int url = 990185999;

        // Loop to check value of URL
        while (url > 0) {

            // Remainder to be appended based on character in representation identifier
            int remainder = url % 62;
            sb.append(representation.charAt(remainder));

            // Reducing the value of the url for further operation
            url = url / 62;

        }

        // Reversed the url to get the result
        String shorturl = sb.reverse().toString();
        System.out.println(shorturl);
    }
}
