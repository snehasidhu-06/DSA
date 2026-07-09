
// 3 sum- brute force
import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prob22 {

    static void threeSum(int[] arr, int target) {

        int n = arr.length;

        Set<List<Integer>> output = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);

                        Collections.sort(temp);
                        output.add(temp);

                    }
                }
            }
        }

        System.out.println(output);

    }

    static void main() {
        int arr[] = { 2, 1, 3, 4, 5 };
        int target = 7;
        threeSum(arr, target);
    }

}
