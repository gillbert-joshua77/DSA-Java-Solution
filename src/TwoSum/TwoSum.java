package TwoSum;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for(int i = 0 ; i < nums.length;i++){
            for (int j = 0 ; j < nums.length ; j++){
                if(i != j && nums[i] + nums [j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}