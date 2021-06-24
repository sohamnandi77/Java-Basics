public class BubbleSortOptimization {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 8, -3, 6, 4, 12 };
        int n = arr.length;
        boolean check = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    check = false;
                }
            }
            if (check)
                break;
        }

        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
