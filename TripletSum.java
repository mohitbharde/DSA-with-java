public class TripletSum {
    public static void tripletSum(int number[]) {
        if (number.length < 3) {
            return;
        }
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1, k = i + 2; k < number.length; j++, k++) {
                if ((number[i] + number[j] + number[k] == 0)) {
                    System.out.println(number[i] + "," + number[j] + "," + number[k]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 0 };
        System.out.println("Triplets are:");
        tripletSum(nums);
    }
}
