public class URLShortener {
    public static void main(String[] args) {

        String representation = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        int url = 990185999;

        while (url > 0) {

            int remainder = url % 62;
            sb.append(representation.charAt(remainder));
            url = url / 62;

        }
        String shorturl = sb.reverse().toString();
        System.out.println(shorturl);
    }
}
