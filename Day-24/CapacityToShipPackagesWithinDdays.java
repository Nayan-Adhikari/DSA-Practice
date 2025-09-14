class Solution {
    private boolean check(int mid, int[] arr, int d) {
        int days = 1, load = 0;
        for (int weight : arr) {
            if (weight > mid) return false;
            if (load + weight > mid) {
                days++;
                load = weight;
            } else {
                load += weight;
            }
        }
        return days <= d;
    }

    public int shipWithinDays(int[] arr, int d) {
        int l = Arrays.stream(arr).max().getAsInt();
        int h = Arrays.stream(arr).sum();
        int ans = h;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (check(mid, arr, d)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}