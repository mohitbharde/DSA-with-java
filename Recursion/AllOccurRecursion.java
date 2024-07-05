package Recursion;

public class AllOccurRecursion {
    static void allOccer(int arr[], int index, int key) {
        if (index == arr.length)
            return;

        if (arr[index] == key) {
            System.out.print(index + " ");
        }
        allOccer(arr, index + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        allOccer(arr, 0, 2);
    }
}
