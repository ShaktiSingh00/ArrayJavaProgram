import java.util.*;

class RecerseArray {
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int l = 0;
        int h = n - 1;

        while (l < h) {
            int temp = arr[l];
            arr[l] = arr[h];
            arr[h] = temp;
            l++;
            h--;
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArray(arr);
        printArray(arr);

    }
}