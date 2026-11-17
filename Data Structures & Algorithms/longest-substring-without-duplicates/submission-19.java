class Solution {
    public int lengthOfLongestSubstring(String s) {
      
       HashSet<Character>set = new HashSet<>();

        // using sliding-window & hashset 
        int l=0;
        int max_len=0; // to store the max_len

        for(int r = 0;  r < s.length(); r++){
            // loop until you find the window with no duplicate ch's 
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            // if a new ch is found the add it to the set and keep track of length 
            set.add(s.charAt(r));
            max_len = Math.max(max_len, r-l+1);
        }
        return max_len;
        
    }
}
