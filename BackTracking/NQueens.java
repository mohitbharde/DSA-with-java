package BackTracking;

public class NQueens {
    public static void nQueens(char board[][], int row) {

        if (row == board.length) {
            printArr(board);
            System.out.println();
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                // place the queen in board[row][col]
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X'; // remove queen after recursing one position

            }
        }
    }

    public static void printArr(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }

        // right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        char board[][] = { { 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X' },
                { 'X', 'X', 'X', 'X' } };
        nQueens(board, 0);
    }
}
