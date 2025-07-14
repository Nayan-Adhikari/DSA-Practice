class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int count = 0;
        int n = arr.length;
        
        int Max, SecondMax;
        
        for(int i=0;i<n;i++){
            if(max<=arr[i]){
                max = arr[i];
            }
        }
        Max = max;
        for(int i=0;i<n;i++){
            if(arr[i]<Max && arr[i]>secondMax){
                secondMax = arr[i];
                count++;
            }
        }
        SecondMax = secondMax;
        
        if(count!=0){
            return SecondMax;
        }
        return -1;
    }
}