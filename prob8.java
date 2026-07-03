//Swap alternate elements in array

static int[] getNewArray(int[] arr) {

    for (int i = 0; i < arr.length - 1; i += 2) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    return arr;

}

static void main() {
    int arr[] = { 1, 2, 3, 4, 5, 6 };
    int[] ans = getNewArray(arr);

    for (int i : arr) {
        System.out.print(i + " ");
    }
}