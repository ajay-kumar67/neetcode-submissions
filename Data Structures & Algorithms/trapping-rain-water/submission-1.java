class Solution {
    public int trap(int[] height) {
        // Optimized version using 2-pointer technique 
        int total_units = 0;
        int l = 0;
        int r = height.length-1;


        int left_max = 0;
        int right_max = 0;

        while(l < r) {
            if(height[l] < height[r]) {
                // if get better container height the update left_max
                left_max = Math.max(left_max, height[l]);
                // if not then subtract current container height from max seen so far from left 
                total_units += left_max - height[l];
                // always increment left pointer to find better container height in arr[]
                l++;
            }
            else{
                right_max = Math.max(right_max,height[r]);
                total_units += right_max - height[r];
                r--;
            }
        }
        return  total_units;



    }
}
