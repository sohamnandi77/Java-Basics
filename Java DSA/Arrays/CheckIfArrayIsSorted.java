public class CheckIfArrayIsSorted {
    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 8, 10, 15, 11 };
        System.out.println(isSorted(arr));
    }
}
