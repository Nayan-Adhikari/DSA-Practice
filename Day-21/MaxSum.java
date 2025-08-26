class Solution {
    public int maxSum(int arr[]) {
        // code here
        int n = arr.length;
        int maxSum = 0;

        // iterate over each element in 
        // the array except the last one
        for (int i = 0; i < n - 1; i++) {
            int mini = arr[i];
            int secondMini = arr[i + 1];

            // iterate over the remaining
            // elements in the array
            for (int j = i + 1; j < n; j++) {
                if (mini >= arr[j]) {
                    secondMini = mini;
                    mini = arr[j];
                } else if (secondMini > arr[j]) {
                    secondMini = arr[j];
                }

                // calculate the current sum of the minimum 
                // and second minimum elements
                int currSum = mini + secondMini;

                // update the maximum sum if the
                // current sum is greater
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
        
    }
}