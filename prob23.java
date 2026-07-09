//remove duplicates from sorted array

import java.util.*;

public class prob23 {

    static void removeDuplicates(int[] arr) {

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }

        }
        System.out.println(i + 1);
    }

    static void main() {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
        removeDuplicates(arr);
    }

}