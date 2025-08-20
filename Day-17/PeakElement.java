class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[n-2]<nums[n-1]){
            return n-1;
        }

        int lb = 1;
        int ub = n-2;
        while(lb<=ub){
            int mid = lb + (ub-lb)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid-1]){
                ub = mid-1;
            }
            else{
                lb = mid+1;
            }
        }
        return -1;
    }
}