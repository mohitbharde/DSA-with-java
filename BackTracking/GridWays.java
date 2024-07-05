package BackTracking;

public class GridWays {
    public static int gridWays(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        if (i == m || j == n)
            return 0;

        int way1 = gridWays(i, j + 1, m, n);
        int way2 = gridWays(i + 1, j, m, n);
        return way1 + way2;
    }

    public static void main(String[] args) {
        System.out.println("Number of ways to reach the bottom right corner: " + gridWays(0, 0, 3, 3));
    }
}
