package RunningSumof1dArray;

class Solution {
    public int[] runningSum(int[] nums) {
        int [] ans  = new int[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            if(i == 0){
                ans[i]=nums[i];
            }else{
                ans[i] = ans[i-1] + nums[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums  = {1,2,3,4};

        int[] result =  s.runningSum(nums);
        for(int i:result){
            System.out.print(i+" ");
        }

    }
}