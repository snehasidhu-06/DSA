// Identify element with highest and lowest frequency

import java.util.HashMap;

public class prob14 {

    static int[] getHighestLowestFrequencyElement(int arr[]) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // insert data
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        // HashMap is ready

        int highestFreq = Integer.MIN_VALUE;
        int highNum = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highNum = currentKey;
            }

        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowNum = -1;

        for (int key : freq.keySet()) {

            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowNum = currentKey;
            }

        }

        int ans[] = { highNum, lowNum };
        return ans;

    }

    static void main() {
        int arr[] = { 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3 };
        int ans[] = getHighestLowestFrequencyElement(arr);
        System.out.println(ans[0] + " " + ans[1]);
    }

}
