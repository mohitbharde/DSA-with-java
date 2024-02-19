public class MajorityElement {
    public static int majorityElement(int arr[], int winner, int lead, int idx) {
        if (idx == arr.length) {
            return winner;
        }

        if (lead == 0) {
            winner = arr[idx];
            lead = 1;
        } else if (winner == arr[idx]) {
            lead++;
        } else if (winner != arr[idx]) {
            lead--;
        }

        return majorityElement(arr, winner, lead, idx + 1);
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums, nums[0], 1, 0));
    }
}
