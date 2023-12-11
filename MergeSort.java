import java.util.Arrays;

class MergeSort {

    public static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr;
        }

        int mid = n / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, n));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int n = left.length;
        int m = right.length;
        int[] num = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (left[i] < right[j]) {
                num[k++] = left[i++];
            } else {
                num[k++] = right[j++];
            }
        }

        while (i < n) {
            num[k++] = left[i++];
        }
        while (j < m) {
            num[k++] = right[j++];
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2, 8, 6 };

        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}