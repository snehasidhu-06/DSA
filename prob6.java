// Count the number of zeros and ones
public class prob6 {

    static int[] getZeroOneCount(int arr[]) {

        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;

            } else {
                oneCount++;
            }
        }
        int ans[] = { zeroCount, oneCount };
        return ans;

    }

    static void main() {
        int arr[] = { 0, 0, 0, 1, 1, 1, 1, 1, 1, 0 };

        int ans[] = getZeroOneCount(arr);
        System.out.print(ans[0] + " " + ans[1]);
    }

}
