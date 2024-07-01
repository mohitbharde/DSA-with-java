package Array;

public class RepeatedNumberInArray {
    public static boolean repeatedNumber(int number[]) {
        int n = number.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (number[i] == number[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println("Repeated Number is : " + repeatedNumber(number));
    }
}
