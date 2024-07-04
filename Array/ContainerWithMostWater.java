import java.util.*;

public class ContainerWithMostWater {
    // public static int mostWater(int water[]) {
    // int mostWater = 0;
    // for (int i = 0; i < water.length; i++) {
    // for (int j = i + 1; j < water.length; j++) {
    // int height = Math.min(water[i], water[j]);
    // int width = j - i;
    // int maxWater = height * width;
    // mostWater = Math.max(mostWater, maxWater);
    // }
    // }

    // return mostWater;
    // }

    public static int mostWater(int[] height) {
        int lp = 0;
        int rp = height.length - 1;
        int maxArea = 0;
        while (lp < rp) {
            int maxheight = Math.min(height[lp], height[rp]);
            int width = rp - lp;
            int area = maxheight * width;
            maxArea = Math.max(maxArea, area);
            if (height[lp] > height[rp]) {
                rp--;
            } else {
                lp++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println("The maximum water is " + mostWater(height));
    }
}
