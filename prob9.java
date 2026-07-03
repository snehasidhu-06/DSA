// Print array intersection element

public class prob9 {

    static void getIntersectionElement(int arr1[], int arr2[]) {

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i] + " ");

                }

            }
        }

    }

    static void main() {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 5, 6, 7, 8 };

        getIntersectionElement(arr1, arr2);
    }
}