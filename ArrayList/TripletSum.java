package ArrayList;

import java.util.*;

public class TripletSum {
    // public static void tripletSum(int number[]) {
    // if (number.length < 3) {
    // return;
    // }
    // for (int i = 0; i < number.length - 2; i++) {
    // for (int j = i + 1, k = i + 2; k < number.length; j++, k++) {
    // if ((number[i] + number[j] + number[k] == 0)) {
    // System.out.println(number[i] + "," + number[j] + "," + number[k]);
    // }
    // }
    // }
    // }

    public static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println("Triplets are:" + threeSum(nums));

    }
}
