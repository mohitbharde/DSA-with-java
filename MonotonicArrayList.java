import java.util.*;

public class MonotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer> arr) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < arr.get(i + 1))
                inc = false;

            if (arr.get(i) > arr.get(i + 1))
                dec = false;
        }

        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(isMonotonic(list)); // true
    }
}
