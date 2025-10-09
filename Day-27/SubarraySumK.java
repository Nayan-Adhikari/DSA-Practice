class Solution {
    public int subarraySum(int[] nums, int k) {
       int n = nums.length;
       int count = 0;
       int arr[] = new int[n];
       
       arr[0] = nums[0];
       for(int i=1;i<n;i++){
        arr[i] = arr[i-1] + nums[i];
       }
       for(int i=0;i<n;i++){
        if(arr[i]==k){
            count++;
        }
        for(int j=0;j<i;j++){
            if(arr[i] - arr[j] == k){
                count++;
            }
        }
       }
       return count;
    }
}