class Solution {
public:

    int helper(int n, vector<int>&dp) {
    // Base case 
      if(n == 0 || n == 1) {
            return 1;
        }
       
        // Cahcing step 
        if(dp[n] != -1) {
            return dp[n];
        }

         dp[n] =  helper(n-1,dp) + helper(n-2,dp);
         return dp[n];

   }




    int climbStairs(int n) {
        // create a dp array 
        vector<int>dp(n+1,-1);
        return helper(n, dp);    
    }
};
