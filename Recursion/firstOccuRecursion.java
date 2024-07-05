package Recursion;

public class firstOccuRecursion {
    static int firstOccu(int arr[], int i, int k) {
        if (i == arr.length - 1) {
            return -1;
        } else if (arr[i] == k) {
            return i;
        }
        return firstOccu(arr, i + 1, k);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(firstOccu(arr, 0, 0));
    }
}
