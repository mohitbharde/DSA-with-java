// import java.util.*;

public class MostFrequentNumberFollowingKey {
    public static int mostFrequentNumber(int arr[], int key) {
        int freqNum = -1000000;
        int lead = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (key == arr[i] && lead == 0) {
                freqNum = arr[i + 1];
            }

            if (arr[i] == key && arr[i + 1] == freqNum) {
                lead++;
            } else if (arr[i] == key && arr[i + 1] != freqNum) {
                lead--;
            }

        }

        return freqNum;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 2, 3 };
        System.out.println("The most frequent number following the given key is: " + mostFrequentNumber(nums, 2));
    }
}
