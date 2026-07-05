// Union of arrays

import java.util.*;

public class prob16 {

    static void union(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        for (int x : set) {
            System.out.print(x + " ");
        }

    }

    static void main() {

        int arr1[] = { 1, 2, 2, 3 };
        int arr2[] = { 2, 3, 4, 5 };

        union(arr1, arr2);

    }
}
