public class LargestElementInTheArray {
    // Noob Method
    public static int LargestNoob(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }

        return -1;
    }

    // OP Method
    public static int LargestOP(int arr[]) {
        int currMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[currMax]) {
                currMax = i;
            }
        }

        return currMax;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 8, 10, 15, 11 };
        System.out.println(LargestNoob(arr));
        System.out.println(LargestOP(arr));
    }
}
