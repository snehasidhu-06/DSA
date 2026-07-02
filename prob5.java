// Return sum of +ve and -ve numbers
public class prob5 {

    static int[] getPosNegSum(int arr[]) {

        int posSum = 0;
        int negSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posSum = posSum + arr[i];
            } else {
                negSum = negSum + arr[i];
            }
        }

        int ans[] = { posSum, negSum };
        return ans;

    }

    static void main() {

        int arr[] = { 1, -3, 5, -7, 9 };

        int[] ans = getPosNegSum(arr);

        System.out.print(ans[0] + " ");
        System.out.print(ans[1]);

    }
}
