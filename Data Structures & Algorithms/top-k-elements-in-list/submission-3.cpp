class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
       /*
       -> Count the frequencies
       -> Sort by frequency 
       -> take the top K elements
       */
        unordered_map<int,int>mp;
        for(int num : nums) {
            mp[num]++;
        }
        // create a vector of pairs 
        /*
        { {1,2},
          {4,5}
        }
        */
        vector<pair<int,int>>v; 
        // for(const auto&p : mp) {
        //     v.push_back({p.second,p.first});
        // }
        for(auto p : mp) {
            v.push_back({p.second,p.first});
        }
        //  sort by freq (desc)
        sort(v.rbegin(),v.rend());
        vector<int>res;
        for(int i=0; i < k; i++) {
            res.push_back(v[i].second);
        }
        return res;
    }
};
