package String;

public class Anagrams {
    public static boolean anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char arr1[] = new char[26], arr2[] = new char[26];
        for (int i = 0; i < str1.length(); i++) {
            int ch = str1.charAt(i) - 'a';
            arr1[ch]++;
            ch = str2.charAt(i) - 'a';
            arr2[ch]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Anagram checker: ");
        System.out.println(anagrams("care", "race")); // true
    }
}
