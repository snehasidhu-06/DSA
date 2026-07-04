// Mode of array : highest frequency element

import java.util.HashMap;

public class prob13 {

    static int findMode(int arr[]) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // to find out the freqenvy of each element

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxFreq = -1; // beacuse initially not known
        int maxFreqWaliKEy = -1;

        // to find out the highest frequency element

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeykiFrequency = freq.get(key);

            if (currentKeykiFrequency > maxFreq) {

                // update the maximum
                maxFreq = currentKeykiFrequency;
                maxFreqWaliKEy = currentKey;
            }
        }

        return maxFreqWaliKEy;

    }

    static void main() {

        int arr[] = { 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 5 };

        System.out.println(findMode(arr));
    }

}
