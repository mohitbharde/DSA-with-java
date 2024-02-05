public class StartAndEndSameCharacterRecursion {
    static int isStartAndEndCharSame(int startIndex, String str, int count) {
        if (startIndex == str.length()) {
            return count;
        }

        StringBuilder str2 = new StringBuilder("");

        for (int i = startIndex; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(startIndex)) {
                count++;
            }
            str2.append(str.charAt(i));
            System.out.println(str2);
        }

        return isStartAndEndCharSame(startIndex + 1, str, count);
    }

    public static void main(String[] args) {
        System.out.println(isStartAndEndCharSame(0, "abcab", 0));
    }
}
