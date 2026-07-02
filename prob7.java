//  Find the first unsorted element in th array 
public class prob7 {

    static int getUnsortedElement(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];
            }

        }
        return -1; // case in which you will come out of loop (rare in this case)

    }

    static void main() {
        int arr[] = { 1, 2, 4, 3, 9 };
        System.out.println(getUnsortedElement(arr));
    }

}
