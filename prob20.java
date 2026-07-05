// unique element
public class prob20 {

    static void unique(int[] arr) {

        int xorSum = 0;
        for (int n : arr) {
            xorSum = xorSum ^ n;
        }
        System.out.println(xorSum);
    }

    static void main() {
        int[] arr = { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        unique(arr);
    }

}
// XOR cancels pairs, leaves the single unpaired number
