import java.util.ArrayList;

public class RearrangeArray {
    public static ArrayList<Integer> assign(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = arr[i];

                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1 };
        int n = arr.length;

        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        ArrayList<Integer> result = assign(arr, n);

        System.out.println("\nRearranged array:");
        for (int value : result) {
            System.out.print(value + " ");
        }

    }
}
