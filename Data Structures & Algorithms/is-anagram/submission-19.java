class Solution {
    public boolean isAnagram(String s, String t) {


        if(s.length() != t.length()) {return false;}

        Map<Character,Integer>mp = new HashMap<>();


      for(char ch : s.toCharArray()) {
        mp.put(ch, mp.getOrDefault(ch,0)+1); // mp[ch]++  
      }

      for(char ch : t.toCharArray()){
        // if ch from t doesnt exist in s 
        if(!mp.containsKey(ch)){
            return false;
        }
        // if ch in t exist in s 
       mp.put(ch,mp.get(ch)-1); // mp[ch]--;
        if(mp.get(ch) < 0) {
          return false;
      }
   }
   return true;



    }
}
