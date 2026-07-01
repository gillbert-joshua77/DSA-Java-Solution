package IntersectionofTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Your original Solution class
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        int[] ans = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            ans[i++] = num;
        }
        return ans;
    }
}

// Main class to execute and test the code
public class Main {
    public static void main(String[] args) {
        Solution solver = new Solution();

        // Test Case 1
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result1 = solver.intersection(nums1, nums2);
        System.out.println("Test Case 1 Output: " + Arrays.toString(result1));
        // Expected Output: [2]

        // Test Case 2
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9, 4, 9, 8, 4};
        int[] result2 = solver.intersection(nums3, nums4);
        System.out.println("Test Case 2 Output: " + Arrays.toString(result2));
        // Expected Output: [4, 9] (or [9, 4] as order doesn't matter)
    }
}
