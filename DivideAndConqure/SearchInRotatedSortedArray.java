package DivideAndConqure;

public class SearchInRotatedSortedArray {
    public static int searchInRotatedArray(int arr[], int si, int ei, int target) {
        if (si > ei)
            return -1;

        int ans = -1;
        int mid = si + (ei - si) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[si] <= arr[mid]) { // left half is sorted
            if (arr[si] <= target && target < arr[mid]) { // target
                ans = searchInRotatedArray(arr, si, mid, target);
            } else { // not the element we are looking for
                ans = searchInRotatedArray(arr, mid + 1, ei, target);
            }
        }

        else if (arr[mid] <= arr[ei]) {
            if (arr[mid] <= target || target <= arr[ei]) {// not the element we are
                ans = searchInRotatedArray(arr, mid, ei, target);
            } else {
                ans = searchInRotatedArray(arr, si, mid - 1, target);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Element found at index : " + searchInRotatedArray(arr, 0, arr.length - 1, 0));
    }
}
