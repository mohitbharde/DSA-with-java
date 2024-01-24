public class SpiralMatrix {
    public static void spiralMatrix(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        while (startCol <= endCol && startRow <= endRow) {
            // Print first row from left to right
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(arr[startRow][i] + " ");
            }

            // Print last column from top to bottom
            for (int j = startRow + 1; j <= endRow; j++) {
                System.out.print(arr[j][endCol] + " ");
            }

            // print last row from right to left
            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(arr[endRow][i] + " ");
            }

            // print first col from bottom to up
            for (int j = endRow - 1; j > startRow; j--) {
                System.out.print(arr[j][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
        };

        spiralMatrix(arr);
    }
}
