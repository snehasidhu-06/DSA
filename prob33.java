//spiral print

import java.util.ArrayList;
import java.util.List;

public class prob33 {
    static void spiralPrint(int[][] arr) {

        int m = arr.length;
        int n = arr[0].length;

        List<Integer> result = new ArrayList<>();

        int startingRow = 0;
        int endingRow = m - 1;

        int startingCol = 0;
        int endingCol = n - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            // left to right
            for (int col = startingCol; col <= endingCol; col++) {
                result.add(arr[startingRow][col]);
            }
            startingRow++;

            // top to bottom

            for (int row = startingRow; row <= endingRow; row++) {
                result.add(arr[row][endingCol]);
            }
            endingCol--;

            // right to left
            if (startingRow <= endingRow) {
                for (int col = endingCol; col >= startingCol; col--) {
                    result.add(arr[endingRow][col]);
                }
                endingRow--;
            }
            // bottom to top
            if (startingCol <= endingCol) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(arr[row][startingCol]);
                }
                startingCol++;
            }
        }

        System.out.print(result);
    }

    static void main() {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        spiralPrint(arr);
    }
}
