public class TransposeOfMatrix {
    public static void transposeOfMatrix(int arr[][]) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println("transpose of matrix");
        transposeOfMatrix(arr);

    }
}
