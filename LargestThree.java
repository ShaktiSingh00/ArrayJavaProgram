public class LargestThree {
    public static void largestThree(int[] arr) {
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {

                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];

            } else if (arr[i] > third && arr[i] != second && arr[i] != first)
                third = arr[i];
        }

        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 3, 8, 9, 12 };
        largestThree(arr);
        // printArray(arr);

    }
}
