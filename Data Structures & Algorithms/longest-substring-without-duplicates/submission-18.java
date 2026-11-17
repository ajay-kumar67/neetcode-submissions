class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        for(int i=0; i < s.length(); i++){
            Set<Character>set = new HashSet<>();
            for(int j=i; j < s.length(); j++){
                if(set.contains(s.charAt(j))){
                    break;
                }
                // if a new ch is found then add it into the set 
                set.add(s.charAt(j)); // s.insert(s[j])
            }
            res = Math.max(res,set.size());
        }
        return res;
    }
}
