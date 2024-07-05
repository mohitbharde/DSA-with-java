package String;

public class NoOfVowels {
    public static int noOfVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String inputStr = "shArdha didi";
        System.out.println("Number of vowels in " + inputStr + " " + noOfVowels(inputStr));
    }
}
