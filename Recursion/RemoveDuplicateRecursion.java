package Recursion;

public class RemoveDuplicateRecursion {
    static StringBuilder removeDuplicate(String str, int index, boolean[] arr, StringBuilder str2) {
        if (index == str.length()) {
            return str2;
        }
        char ch = str.charAt(index);
        if (arr[ch - 'a'] == false) {
            str2.append(ch);
            arr[ch - 'a'] = true;
            removeDuplicate(str, index + 1, arr, str2);
        }

        removeDuplicate(str, index + 1, arr, str2);

        return str2;
    }

    public static void main(String[] args) {
        boolean arr[] = new boolean[26];
        StringBuilder str2 = new StringBuilder();
        System.out.println(removeDuplicate("appnaacclloogee", 0, arr, str2));
    }
}
