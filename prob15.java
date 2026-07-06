// Shift array elements by k position

public class prob15 {

    static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }

    }
static void rotateByK(int[] arr, int k) {
        int n = arr.length;

        k = k % n; // handle cases where k is greater than n

        if (k == 0)
            return;

        // reverse whole array

        reverse(arr, 0, n - 1);

        // reverse first k elements

        reverse(arr, 0, k - 1);

        // reverse remaing lements

        reverse(arr, k, n - 1);

    }

    static void main() {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;

        rotateByK(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}