class Solution {
public:

   int f(int i, vector<int>&nums, vector<int>&dp){


      // explore both the paths and chose the path that give more money

      if(i >= nums.size()) {
        return 0; // no path exist 
      }
      // memoize the result 
      if(dp[i] != -1) {
        return dp[i];
      }

      int rob = nums[i] + f(i+2, nums, dp);
      int skip = f(i+1, nums, dp);

      dp[i] =  max(rob, skip);
      return dp[i];


   }




    int rob(vector<int>& nums) {
        int n = nums.size();
        vector<int>dp(n+1, -1);

        return f(0,nums,dp);
        
    }
};
