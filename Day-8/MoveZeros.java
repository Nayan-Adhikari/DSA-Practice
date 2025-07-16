class Solution {
    void rotateArray(int[] arr,int start){
        int temp = arr[start];
        for(int i=start;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
    public void moveZeroes(int[] nums) {
        int i=0;
        int count=0;
        int n = nums.length;
        while(i!=n-count){
            if(nums[i]==0){
                rotateArray(nums,i);
                count++;
            }
            else{
                i++;
            }
        }
    }
}