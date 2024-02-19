public class FindSubsets {
    public static void findSubsets(int i, String str, String ans) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        findSubsets(i + 1, str, ans + str.charAt(i));
        findSubsets(i + 1, str, ans);
    }

    public static void main(String[] args) {
        findSubsets(0, "abc", "");
    }
}
