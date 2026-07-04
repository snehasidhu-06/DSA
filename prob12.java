// shift array elements by 1 position
public class prob12 {

    static void shiftElements(int arr[]) {
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];

        }
        arr[0] = temp;
    }

    static void main() {
        int arr[] = { 1, 2, 3, 4, 5 };
        shiftElements(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

}
