public class Delete {

    public static int deleteAnElement(int arr[], int x) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                break;
        }

        if (i == arr.length)
            return arr.length;

        for (int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        return arr.length - 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        System.out.println(deleteAnElement(arr, 3));
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
