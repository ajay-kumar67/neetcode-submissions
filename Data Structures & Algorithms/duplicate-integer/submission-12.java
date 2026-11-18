class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans = false;

        Map<Integer,Integer>m = new HashMap<>();

        for(int num : nums) {
            m.put(num, m.getOrDefault(num,0) + 1);
        }

        // for(int key : m.keySet()){
        //     if(m.get(key) > 1) ans = true;
        // }

        for(Map.Entry<Integer,Integer>entry : m.entrySet()) {
            if(entry.getValue() > 1) return  true;
        }
        return ans;

        
    }
}