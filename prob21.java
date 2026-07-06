// Two sum - brute force
public class prob21 {

    static int[] twoSum(int[] arr, int target) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    int ans[] = { arr[i], arr[j] };
                    return new int[] { arr[i], arr[j] };
                }
            }
        }
        return new int[] { -1, -1 };

    }

    static void main() {
        int arr[] = { 1, 2, 3, 4, 5 };
        int[] ans = twoSum(arr, 7);
        System.out.print(ans[0] + " " + ans[1]);

    }
}