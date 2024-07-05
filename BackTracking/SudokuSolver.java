package BackTracking;

public class SudokuSolver {
    public static boolean isSafe(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num)
                return false;
        }

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num)
                return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    public static boolean sudokuSolver(char[][] board, int row, int col) {
        if (row == 9)
            return true;

        int nextRow = row, nextCol = col + 1;
        if (col + 1 >= 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] != '.')
            return sudokuSolver(board, nextRow, nextCol);

        for (int i = 1; i <= 9; i++) {
            int num = i + '0';
            char number = (char) num;
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (sudokuSolver(board, nextRow, nextCol))
                    return true;
                board[row][col] = '.';
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
