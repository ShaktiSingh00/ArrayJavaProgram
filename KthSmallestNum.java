import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class KthSmallestNum {

    public static int kthSmallest(int[] nums, int k) {
        int n = nums.length;

        Set<Integer> hset = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            hset.add(nums[i]);
        }

        if (hset.size() < k) {
            // If there are fewer than k distinct elements, return -1 or handle as needed
            return -1;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : hset) {
            pq.offer(num);
        }
        // Remove the k - 1 largest elements
        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        // The top of the priority queue now contains the kth smallest element
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] array = { 12, 3, 5, 7, 4, 19 };
        int k = 5;

        int result = kthSmallest(array, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
}
