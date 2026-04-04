public class SelectionSort {

    // Function to perform selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through array elements
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 12, 43, 1, 6, 90, 63 };

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);

        System.out.println("\nAfter selection sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}