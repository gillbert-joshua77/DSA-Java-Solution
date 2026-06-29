package BestTimetoBuyandSellStock;
class Solution {
    public int maxProfit(int[] prices) {

        int minValue = prices[0];
        int profit = 0 ;

        for(int i = 0 ; i < prices.length ; i++){
            minValue = Math.min(minValue, prices[i]);
            profit = Math.max(profit ,prices[i] - minValue) ;
        }
        return profit;
    }
    public static void main(String [] args){
        Solution s = new Solution();
        System.out.println(s.maxProfit(new int[]{7,1,5,3,6,4}));
    }

}