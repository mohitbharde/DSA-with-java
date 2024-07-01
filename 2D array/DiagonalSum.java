public class DiagonalSum {
    /*
     * This program calculates the sum of all the elements on the diagonal of a
     * square matrix.
     */
    public static int diagonalSum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // PD
            sum += arr[i][i];
            // SD
            if (i != arr.length - i - 1) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("The sum of all the elements on the diagonal is: " + diagonalSum(mat));
    }
}
