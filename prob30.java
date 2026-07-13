
// Wave print a matrix
import java.util.List;
import java.util.ArrayList;

public class prob30 {

    static void Wave(int[][] arr, int m, int n) {

        List<Integer> result = new ArrayList<>();

        // lets move column wise

        for (int col = 0; col < n; col++) {

            if (col % 2 == 1) {
                // odd - bottom - top
                for (int row = m - 1; row >= 0; row--) {
                    result.add(arr[row][col]);
                }

            } else {
                for (int row = 0; row < m; row++) {
                    result.add(arr[row][col]);
                }
            }

        }

        System.out.print(result);

    }

    static void main() {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int m = arr.length;
        int n = arr[0].length;

        Wave(arr, m, n);

    }
}
