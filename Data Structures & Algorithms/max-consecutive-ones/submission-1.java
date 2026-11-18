class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int max_len = 0;

        for(int r = 0; r < nums.length; r++) {
            if(nums[r] == 0) {
                l = r+1; 
            }else { // nums[r] = 1 
             max_len = Math.max(max_len,r-l+1);
            }
        }
        return max_len;
    }
}