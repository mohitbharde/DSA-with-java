package Array;

public class LinearSearch {

    public static int Linear_Search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;
    }

    public static int Linear_Search(String arr[], String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // // Integer Array
        // int data1 [] ={23,45,67,89};
        String data2[] = { "kell", "hello", "hi", "by", "byy" };
        System.out.println("Linear Search in Integer array:");
        int result1 = Linear_Search(data2, "hi");
        if (result1 == -1) {
            System.out.print("Element is not present in the array.");
        } else {
            System.out.print("Element is present at index " + result1);
        }

    }
}
