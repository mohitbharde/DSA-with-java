package DivideAndConqure;

public class MergeSortString {
    public static void sort(String arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        merge(arr, start, mid, end);
        return;
    }

    public static void merge(String arr[], int start, int mid, int end) {
        String ans[] = new String[end - start + 1];
        int i = start; // index of first array
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }

        while (j <= end) {
            ans[k++] = arr[j++];
        }

        for (int st = start, l = 0; l < ans.length; l++, st++) {
            arr[st] = ans[l];
        }
    }

    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        sort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
