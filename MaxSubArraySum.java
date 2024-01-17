public class MaxSubArraySum {

    public static int maxSubArraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int first = i;
            for (int j = i; j < numbers.length; j++) {
                int last = j;
                int currSum = first == 0 ? prefix[last] : prefix[last] - prefix[first - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }

            }
        }
        return maxSum;
    }

    public static int printSubArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                System.out.println("sum of subArray is : " + sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        int result = maxSubArraySum(numbers);

        System.out.println("max sum : " + result);
    }

}
