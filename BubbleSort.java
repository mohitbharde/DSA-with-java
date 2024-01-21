public class BubbleSort {
    public static void bubbleSortInIncreasing(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (count == arr.length - 1) {
                System.out.println("sorted array");
                return;
            }
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    count = count + 1;
                    ;
                }
            }
        }
    }

    public static void bubbleSortInDecrement(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    count++;
                }
            }

            if (count == arr.length - 1) {
                System.out.println("sorted array");
                return;
            }
        }
    }

    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6 };
        bubbleSortInDecrement(number);
        System.out.println("The sorted array is: ");
        displayArray(number);
    }
}
