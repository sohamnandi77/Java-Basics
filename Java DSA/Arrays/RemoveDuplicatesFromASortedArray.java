public class RemoveDuplicatesFromASortedArray {
    public static void removeDuplicatesNoob(int arr[]) {
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res = i;
            }
        }

    }

    public static void main(String[] args) {
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // Declaring array literal
    }
}