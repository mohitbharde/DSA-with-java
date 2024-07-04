package String;

public class StringCompression {
    public static String stringCompression(String str) {
        StringBuilder newstr = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            newstr.append(str.charAt(i));
            if (i != 0) {
                while (str.charAt(i) == str.charAt(i - 1) && i < str.length()) {
                    count++;
                    i++;
                }
            }

            newstr.append(count.toString());
        }

        return newstr.toString();
    }

    public static void main(String[] args) {
        System.out.println("Input: " + "aaaabbbcccc");
        System.out.print("Output: " + stringCompression("aaaabbbcccc"));
    }
}
