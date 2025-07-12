class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        int l,s=-1;
        if(nums.length == 1){
            if(nums[0]==target){
                arr[0] = 0;
                arr[1] = 0;
                return arr;
            }
            else{
                return arr;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                s = i;
                break;
            }
        }
        int start = s;
        l = s;
        if(s!=-1){
            while(s!=nums.length-1){
                if(nums[s]!=nums[s+1]){
                    break;
                }
                else{
                    s++;
                    l++;
                }
            }
        }
        arr[0] = start;
        arr[1] = l;
        return arr;
    }
} {
    
}
