class Solution {
public:
    void sortColors(vector<int>& nums) {

        int low = 0; // low → beginning of unknown region
        int mid = 0;  // mid → scans unknown region
        int high = nums.size()-1; //end of unknown-region 

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums[low], nums[mid]);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++; // bcz 1 is already in its correct position
            }
            else{
                swap(nums[mid],nums[high]);
                high--;
            }
        }
        
    }
};