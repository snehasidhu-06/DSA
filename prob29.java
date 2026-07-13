//Print the sum of each row in 2d array

import java.util.List;
import java.util.ArrayList;

public class prob29 {

    static void sumCol(int[][] arr) {

        List<Integer> result = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        for (int col = 0; col < n; col++) {

            int sum = 0;
            for (int row = 0; row < m; row++) {
                int value = arr[row][col];
                sum = sum + value;

            }
            result.add(sum);
        }

        System.out.print(result);

    }

    static void main() {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        sumCol(arr);
    }

}
