class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        if(nums.length == 1){
            return nums[i];
        }
        
        while(i<nums.length){
            if(i==nums.length-1 && (nums[nums.length-1] != nums[nums.length-2])){
                    return nums[i];
            }
            else if(nums[i]==nums[i+1]){
                i=i+2;
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}