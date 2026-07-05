//Sort 0s and 1s - Optimal solution
public class prob18 {

    static void sortArray(int[] arr) {

        int count0 = 0;

        // count zeros

        for (int x : arr) {
            if (x == 0)
                count0++;
        }

        // fill zeros
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        // fill ones

        for (int i = count0; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

    static void main() {
        int arr[] = { 1, 0, 1, 1, 0, 0, 1 };

        sortArray(arr);
    }
}
