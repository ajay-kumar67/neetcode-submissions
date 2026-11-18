class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        bool ans = false;
        unordered_map<int,int>mp;

        for(int num : nums) {
             mp[num]++;
        }

        for(auto &it : mp) {
            if(it.second > 1 ) {
                ans = true;
            }
        }
        return ans;


    }
};