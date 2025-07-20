class Solution {
    public int findFloor(int[] arr, int x) {
        int n = arr.length;
        // If last element is smaller than x
        if (x >= arr[n - 1])
            return n - 1;

        // If first element is greater than x
        if (x < arr[0])
            return -1;

        // Linearly search for the first element
        // greater than x
        // greater than x
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
               return (i-1);
            }
        }
        return ans;
    }
}
