public class Search {

    public static int searchAnElement(int arr[], int x) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(searchAnElement(arr, 3));
    }
}
