//remove dublicates only after second occurence in an sorted array
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class Practise {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int index = 2; // Start from the third element
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]) { // Check if current element is not equal to the element two places back
                nums[index++] = nums[i]; // Place it at the current index and increment index
            }
        }
        return index; // Return the new length of the array
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}

