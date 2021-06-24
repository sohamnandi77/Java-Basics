public class SecondLargest {
    public static int secondLargest(int arr[]) {
        int Largest = 0, secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[Largest]) {
                secondLargest = Largest;
                Largest = i;
            } else if (arr[i] != arr[Largest]) {
                if (secondLargest == -1 || arr[i] > arr[secondLargest])
                    secondLargest = i;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 8, 10, 11, 15 };
        System.out.println(secondLargest(arr));
    }
}
