class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int u = nums.length - 1;
        int index = -1;
        int mid;
        while(l<u){
            mid = l + (u-l)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[l] == target){
                return l;
            }
            else if(nums[u] == target){
                return u;
            }
            else if(nums[mid]>target){
                u = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        if(index == - 1){
            if(nums[l]>target && l != 0){
                index = l;
            }
            else if(nums[l]<target){
                index = l + 1;
            }
            else{
                index = 0;
            }
        }
        return index;
    }
}