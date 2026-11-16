class Solution {
    public int maxProfit(int[] prices) {
        
        int total_profit = 0; 
        int curr_profit = 0;

        for(int i=1; i < prices.length; i++){
            if(prices[i] > prices[i-1]) {
                curr_profit = (prices[i]-prices[i-1]);
                total_profit += curr_profit;
            }
        }
        return total_profit;
        
    }
}