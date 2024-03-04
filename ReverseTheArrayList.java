import java.util.ArrayList;

public class ReverseTheArrayList {
    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Adding elements to the arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        reverse(list, 2, list.size() - 1);

        System.out.println("Reversed ArrayList is: " + list.toString());
    }
}
