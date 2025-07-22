//sort an array and return the indices of the given target value
import java.util.Arrays;
class Practise {
    public static int[] sortAndFindIndices(int[] nums, int target) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);
        
        int[] indices = new int[2];
        for (int i = 0; i < sortedNums.length; i++) {
            if (sortedNums[i] == target) {
                indices[0] = i;
                indices[1] = i;
                while (i + 1 < sortedNums.length && sortedNums[i + 1] == target) {
                    indices[1] = ++i;
                }
                break;
            }
        }
        
        return indices;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 3, 2, 5};
        int target = 2;
        int[] result = sortAndFindIndices(nums, target);
        System.out.println("Indices of target " + target + ": " + Arrays.toString(result)); // Output: [0, 1]
    }
}

