class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>>map = new HashMap<>(); // key -> all anagrams associated with that key 

        for(String str : strs) {
            char[] charArray = str.toCharArray(); // convert each string to ch array 
            Arrays.sort(charArray);
            String key = new String(charArray);

            // if key already exist then simply return its existing value 
            // If the key doesn't exist, create a new ArrayList and associate it with that key.
            map.computeIfAbsent(key, k -> new ArrayList<>());
            // add the original string to the corresponding group
            map.get(key).add(str);


        }
        return new ArrayList<>(map.values());  

    }
}
