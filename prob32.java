//Rotate Image

public class prob32 {

    static void rotate(int[][] arr, int N) {
        // transpose of a matrix

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {

                // Swap

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reverse all rows
        for (int row = 0; row < N; row++) {
            int startCol = 0;
            int endCol = N - 1;
            while (startCol <= endCol) {

                int temp = arr[row][startCol];
                arr[row][startCol] = arr[row][endCol];
                arr[row][endCol] = temp;

                startCol++;
                endCol--;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void main() {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        rotate(arr, 3);
    }
}