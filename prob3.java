// Linear Search - true or false
public class prob3 {

    static boolean findTarget(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }

        }
        return false;
    }

    static void main() {

        int arr[] = { 1, 3, 5, 7, 9 };
        boolean ans = findTarget(arr, 5);
        System.out.println(ans);
    }

}
