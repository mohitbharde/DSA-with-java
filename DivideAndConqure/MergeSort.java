package DivideAndConqure;

public class MergeSort {
    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(start, mid, end, arr);
    }

    public static void merge(int start, int mid, int end, int[] arr) {
        int temp[] = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            arr[start++] = temp[l];
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 2, 6, 7, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
