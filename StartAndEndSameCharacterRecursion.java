public class StartAndEndSameCharacterRecursion {
    static int isStartAndEndCharSame(int startIndex, int endIndex, String str, int count) {
        if (startIndex == str.length() || endIndex == str.length())
            return count;

        if (str.charAt(startIndex) == str.charAt(endIndex)) {
            count += 1;
        }
        isStartAndEndCharSame(startIndex, endIndex + 1, str, count);
        isStartAndEndCharSame(startIndex + 1, endIndex + 1, str, count);

        return count;
    }

    public static void main(String[] args) {
        System.out.println(isStartAndEndCharSame(0, 0, "abcab", 0));
    }
}
