package ArrayList;

import java.util.*;

public class LonelyNumbersInArrayList {
    public static void lonelyNumber(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            if (!arr.contains(temp + 1) && !arr.contains(temp - 1)) {
                System.out.println(temp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        lonelyNumber(list);
    }
}
