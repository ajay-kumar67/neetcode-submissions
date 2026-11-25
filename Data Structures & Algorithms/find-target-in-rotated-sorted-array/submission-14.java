class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;

        while(l <= r) {

            int mid = r + (l-r)/2 ; 

            if(nums[mid] == target) {
                return mid;
            }

            // check if left half-portion is sorted 
            if(nums[l] <= nums[mid]) {
                // check for target in left-sorted half 
                if(target >= nums[l] && target < nums[mid]) {
                      r = mid-1; // shrink right portion
                }
                else {
                     l = mid+1;
                }
            }
            // right half-portion is sorted nums[mid] < nums[right] 
            else{
                if(target > nums[mid] && target <= nums[r]) {
                    l = mid+1; // shrink left-half
                }else{
                    r = mid-1;
                }
            }
        } // while loop ends 
        return -1;
        



    }
}
