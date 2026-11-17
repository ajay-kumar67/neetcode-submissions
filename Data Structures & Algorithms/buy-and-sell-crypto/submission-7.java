class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int maxP = 0;
    while(r < prices.length){
        if(prices[r] > prices[l]){
            maxP = Math.max(maxP, prices[r]-prices[l]);
        }else{// if you found a better minimum then update 
          l = r;
        }
        r = r+1;
    }
    return maxP;
    }
}
