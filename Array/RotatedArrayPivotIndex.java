package Array;

public class RotatedArrayPivotIndex {
    public static int pivotIndex(int number[], int target) {
        int start = 0;
        int end = number.length - 1;
        int mid = (start + end) / 2;
        int index = -1;

        if (number.length == 1) {
            return index;
        }
        while (start <= end) {
            if (number[mid] > number[mid + 1]) {
                index = mid + 1;
                break;
            } else if (number[mid] < number[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        System.out.println(index);

        if (number[index] == target) {
            return index;
        }

        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1 };
        System.out.println("The pivot element is at index: " + pivotIndex(number, 0));
    }
}
