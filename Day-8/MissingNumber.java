class Solution {
    boolean linearSearch(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int min=0;
        for(int i=0;i<=n;i++){
            if(linearSearch(nums,min) == false){
                return min;
            }
            else{
                min = min+1;
            }
        }
        return 1;
    }
}