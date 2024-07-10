
public class dumy {
    static boolean search(String pattern, String text, int idx) {
        // your code here
        // ArrayList<String> ans = new ArrayList<>();

        for (int i = idx + 1; i < text.length(); i++) {
            if (i + pattern.length() <= text.length()) {
                String substr = text.substring(i, i + pattern.length());
                if (pattern.equals(substr))
                    return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(search("a", "acdcdacdc", 0));
    }
}
