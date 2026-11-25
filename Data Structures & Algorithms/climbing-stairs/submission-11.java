class Solution {
    public int climbStairs(int n) {

        if(n <= 2) {
            return n;
        }
        /*
         n = 2 there are two ways to reach from n = (2 -> 0)
         n = 1 there is only 1 way n = (1 -> 0) 
        */



        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
   
    }
}
