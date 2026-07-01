import java.util.HashSet;

// Your original Solution class
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}

// Main class to execute and test the code
public class Main {
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Test Case 1: Contains duplicates
        int[] nums1 = {1, 2, 3, 1};
        boolean result1 = solver.containsDuplicate(nums1);
        System.out.println("Test Case 1 Output: " + result1);
        // Expected Output: true

        // Test Case 2: All elements are unique
        int[] nums2 = {1, 2, 3, 4};
        boolean result2 = solver.containsDuplicate(nums2);
        System.out.println("Test Case 2 Output: " + result2);
        // Expected Output: false

        // Test Case 3: Multiple duplicate values
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result3 = solver.containsDuplicate(nums3);
        System.out.println("Test Case 3 Output: " + result3);
        // Expected Output: true
    }
}
