//Transpose of a matrix
public class prob31 {

    static void transpose(int[][] arr) {

        if (arr == null || arr.length == 0) {
            System.out.print(new int[0][0]);
        }
        // original array
        int rows = arr.length;
        int cols = arr[0].length;

        // for new array

        int newRows = arr[0].length;
        int newCol = arr.length;

        int ans[][] = new int[newRows][newCol];

        // logic

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                ans[col][row] = arr[row][col];
            }
        }

        // Print transpose
        for (int row = 0; row < cols; row++) {
            for (int col = 0; col < rows; col++) {
                System.out.print(ans[row][col] + " ");
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
        transpose(arr);
    }
}
