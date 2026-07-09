//Find first repeating element

import java.util.HashMap;

public class prob24 {

    static void FirstRepeating(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int key : arr) {

            freq.put(key, freq.getOrDefault(key, 0) + 1);

        }

        for (int key : arr) {
            if (freq.get(key) > 1) {
                System.out.println(key);
                break;
            }
        }
    }

    static void main() {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        FirstRepeating(arr);
    }

}
