class Solution {
    public int findKthLargest(int[] nums, int k) {

     PriorityQueue<Integer>minHeap = new PriorityQueue<>();
     
     // minHeap ->  minHeap.offer(num) -> minHeap.push()
     for(int num : nums) {
        minHeap.offer(num);

        if(minHeap.size() > k) {
            minHeap.poll(); // minHeap.pop()
        }
     }
      return minHeap.peek();   
    }
}
