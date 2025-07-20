//return the  num which appers only once in an array where all other numbers appear thrice
import java.util.HashMap;
import java.util.Map;
class Practise {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return -1; // This line should never be reached if input is valid
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        System.out.println("The number that appears only once: " + singleNumber(nums)); // Output: 3
    }
}


