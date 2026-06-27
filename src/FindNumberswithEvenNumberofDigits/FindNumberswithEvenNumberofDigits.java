package FindNumberswithEvenNumberofDigits;

class Solution {
    public int findNumbers(int[] nums) {
        int cnt=0;
        for(int num:nums){
            if(((int)Math.log10(num)+1)%2==0) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {12,345,2,6,7896};
        System.out.println(s.findNumbers(nums));
    }
}