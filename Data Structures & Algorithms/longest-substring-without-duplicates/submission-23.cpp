class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        // create a unordered map 
        unordered_map<char,int>mp;
        int l = 0;
        int max_len = 0;
        for(int r = 0; r < s.size(); r++){
            if(mp.find(s[r]) != mp.end()){
                l = max(mp[s[r]]+1, l);
            }
            mp[s[r]] = r;
            max_len = max(max_len, r-l+1);
        }
        return max_len;
    }
};
