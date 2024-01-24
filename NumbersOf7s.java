public class NumbersOf7s {
    public static int numbersOf7s(int arr[][]) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    num++;
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println("Number of 7's in the array is: " + numbersOf7s(arr));
    }
}
