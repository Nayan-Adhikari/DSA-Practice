class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        if(nums.length == 1){
            return false;
        }
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
                break;
            }
        }
        if(count!=0){
            return true;
        }
        return false;
    }
}