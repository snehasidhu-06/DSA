//Sort 0s and 1s
public class prob17 {

    static void sortArray(int[] arr) {

        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {

            if (arr[i] == 1 && arr[j] == 0) {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[i] == 0) {
                i++;

            }

            if (arr[j] == 1) {
                j--;
            }

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
