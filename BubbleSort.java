class BubbleSort {
    static void bubbleSort(int[] arr) {
        int len = arr.length;
        int temp;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < (len - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 60, 35, 2, 45, 320, 5};
        bubbleSort(arr);
        System.out.println("Posortowana tablica:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}  