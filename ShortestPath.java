public class ShortestPath {
    public static float shortestPath(String str) {
        float x = 0, y = 0;
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            }
        }

        return (float) Math.sqrt((x * x + y * y));
    }

    public static void main(String[] args) {
        String path = "NNNEEESSSWWW";
        System.out.println("The distance of the shortest path is " + shortestPath(path));
    }
}
