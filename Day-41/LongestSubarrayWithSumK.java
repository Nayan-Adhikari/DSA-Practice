class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;

        // Prefix sum
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        int length = 0;

        for (int i = 0; i < n; i++) {

            // Subarray starting from index 0
            if (arr[i] == k) {
                length = Math.max(length, i + 1);
            }

            // Subarray starting after index j
            for (int j = 0; j < i; j++) {
                if (arr[i] - arr[j] == k) {
                    length = Math.max(length, i - j);
                }
            }
        }

        return length;
    }
}