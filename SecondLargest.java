public class SecondLargest {
    public static void secondLargest(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        System.out.println(secMax);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 12, 18, 20, 14, 25, 30, 45 };
        secondLargest(arr);
    }

}
