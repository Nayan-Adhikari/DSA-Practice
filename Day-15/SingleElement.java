class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        if(nums[0]!=nums[1]){
            return nums[0];
        }
       int l=0;
       int u=n-1;
       while(l<=u){
            int mid = l+(u-l)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if((nums[mid]==nums[mid+1] && mid%2==0)||(nums[mid-1]==nums[mid]&& mid%2==1)){
                l=mid+1;
            }
            else {
                u=mid-1;
            }
       }
       return -1;
    }
}