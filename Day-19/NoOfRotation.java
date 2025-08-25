class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                return i+1;
            }
        }
        return 0;
    }
}