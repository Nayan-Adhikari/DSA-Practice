class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int k = 0;
        int h = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]>=0){
                pos[k] = nums[i];
                k++;
            }else{
                neg[h] = nums[i];
                h++;
            }
        }
        int a = 0;
        int i = 0;
        int j = 0;
        int[] result = new int[n];
        while(i != k && j != h && a != (k+h+1)){
            result[a] = pos[i];
            a++;
            i++;
            result[a] = neg[j];
            a++;
            j++;
        }
        return result;
    }
}