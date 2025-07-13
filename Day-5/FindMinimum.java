class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int u = nums.length - 1;

        int min = Integer.MAX_VALUE;

        while(l<=u){
            int mid = l + (u-l)/2;
            if(nums[mid] == min){
                return min;
            }
            else if(nums[l]>nums[mid]){
                min=Math.min(nums[mid],min);
                u=mid-1;
            }
            else{
                min = Math.min(nums[l],min);
                l=mid+1;
            }
        }
        return min;
    }
}