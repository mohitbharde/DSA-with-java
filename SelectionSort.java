public class SelectionSort {
    public static void selectionSortForIncreasing(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }
    }

    public static void selectionSortForDecreasing(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }
    }

    public static void displayArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number[] = { 5, 4, 3, 2, 1, 1 };
        selectionSortForIncreasing(number);
        System.out.println("The sorted array is: ");
        displayArray(number);
        selectionSortForDecreasing(number);
        System.out.println("The sorted array is: ");
        displayArray(number);
    }
}
