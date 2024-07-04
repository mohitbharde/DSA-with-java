import java.util.*;

public class TrappedRainwater {

    public static void displayArray(int arr[]) {
        System.out.println("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int trappedWater(int[] height) {
        // calculate left max boundary 0 - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        displayArray(leftMax);

        // calculate right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[rightMax.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        displayArray(rightMax);

        int trappedWater = 0;
        // loop
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Trapped Water: " + trappedWater(height));
    }

}