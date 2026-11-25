class Solution {
public:
    int maxProfit(vector<int>& prices) {

        int maxP = 0;
        int mini = prices[0];

        for(int i=0; i < prices.size(); i++) {
            mini = min(mini, prices[i]); // if curr price is minimum then update it 

            maxP = max(maxP, prices[i] - mini);
        }

        return maxP;
        
    }
};
