//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
import java.util.Arrays;
class Practise {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // Handle cases where k is larger than the array length
        reverse(nums, 0, nums.length - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, nums.length - 1); // Reverse the remaining elements
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums)); // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
