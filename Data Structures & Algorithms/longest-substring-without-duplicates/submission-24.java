class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character>charSet = new HashSet<>();
        int l = 0;
        int res = 0;

        for(int r = 0; r < s.length(); r++){
            // shrink the winow until duplicate ch is removed 
            while(charSet.contains(s.charAt(r))){ // charSet.find(s[r]) != charSet.end()
                charSet.remove(s.charAt(l));  // charSet.remove(s[l])
                l++;
            }
            // if the ch is occured for 1st time then add it into the set direclty 
            charSet.add(s.charAt(r)); // s.insert(s[r]);
            res = Math.max(res, r-l+1);
        }
        return res;



        
    }
}
