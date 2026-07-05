// Missing numbers
public class prob19 {

    static void missingNumber(int[] arr) {

        int xorSum = 0;

        // XOR with all elements in the range

        for (int n : arr) {

            xorSum = xorSum ^ n;

        }

        int n = arr.length;

        for (int i = 0; i <= n; i++) {
            xorSum = xorSum ^ i;
        }

        System.out.println(xorSum);

    }

    static void main() {

        int arr[] = { 0, 2, 3, 4, 5 };
        missingNumber(arr);
    }
}
