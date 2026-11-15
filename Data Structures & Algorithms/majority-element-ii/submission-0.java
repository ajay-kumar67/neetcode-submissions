class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer>mp = new HashMap<>();
        List<Integer>li = new ArrayList<>();

        for(int num : nums) {
            mp.put(num, mp.getOrDefault(num,0) + 1);
        }

        int n = nums.length;


        for(int key : mp.keySet()) {
          if(mp.get(key) > (n/3)) {
            li.add(key);
          }
        }
        return li;   
    }
}