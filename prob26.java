
//Missing elements from an array with duplicates
import java.util.*;

public class prob26 {
    static void MissingElements(int[] arr) {

        int n = arr.length;
        // marking
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            int value = Math.abs(arr[i]);
            int position = value - 1;
            // mark position (if not alrady -ve)

            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }

        }
        // travel array and when you encounter positive valur,print the number

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }

        System.out.print(ans);
    }

    static void main() {
        int arr[] = { 1, 4, 4, 5, 2, 2 };
        MissingElements(arr);
    }

}