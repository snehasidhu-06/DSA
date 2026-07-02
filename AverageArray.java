public class AverageArray {

    static double getAverage(int[] arr) {

        double sum = 0;// The key is that this is not a normal for loop. It's an enhanced for loop
                       // (also called a for-each loop).
        for (int i : arr) {
            sum += i; // sum = sum+i
            // Here, i is NOT the index. It is the actual value stored in the array.
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;

    }

    static void main() {
        int[] arr = { 2, 4, 1, 3 };
        System.out.println(getAverage(arr));
    }
}
