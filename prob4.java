//Find thr maximum element  in an array
public class prob4 {

    static int getMaximum(int arr[]) {

        int maxi = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }

        return maxi;

    }

    static void main() {
        int arr[] = { 5, 70, 6, 52, 1000 };
        System.out.println(getMaximum(arr));
    }

}
