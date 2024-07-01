package Array;

public class PairsInArray {

    public static void printPairs(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("Pair is: " + numbers[i] + "," + numbers[j]);
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("All pairs are :");
        printPairs(numbers);
    }
}
