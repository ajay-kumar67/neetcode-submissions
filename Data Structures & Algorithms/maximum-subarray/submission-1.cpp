class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxSub = nums[0];
        int currSum = 0;
        for(int num : nums) {
            currSum = max(currSum + num, num);
            maxSub = max(maxSub,currSum);
        }
        return maxSub;

    }
};
