//Find pivot Index

import java.util.*;

public class prob25 {

    static void pivotIndex(int[] arr) {

        int n = arr.length;

        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        leftSum[0] = 0;

        for (int i = 1; i < n; i++) {
            leftSum[i] = leftSum[i - 1] + arr[i - 1];
        }

        rightSum[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i]) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 7, 3, 6, 5, 6 };
        pivotIndex(arr);
    }

}
