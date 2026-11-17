class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map<Character,Integer>mp = new HashMap<>();

        int l = 0;
        int max_len = 0;
        for(int r = 0; r < s.length(); r++){
            if(mp.containsKey(s.charAt(r))){
                l = Math.max((mp.get(s.charAt(r))+1) , l); // take max to avoid backward movement 
            }
            // if the ch is occured for the first time then simply add it to the map 
             //   add current character to the map along with its index 
              mp.put(s.charAt(r),r);  // mp[s[r]] = r;
              max_len = Math.max(max_len,r-l+1);
            
        }
         return max_len;
   



        
    }
}
