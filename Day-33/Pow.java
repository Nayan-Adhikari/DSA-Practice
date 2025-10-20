class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;  // Base case
        
        // Handle negative powers
        if (n < 0) {
            x = 1 / x;
            // Be careful with overflow when n == Integer.MIN_VALUE
            // Convert to long before negating
            n = -(n + 1);  // avoid overflow
            return x * myPow(x, n);
        }

        double half = myPow(x, n / 2);
        if (n % 2 == 0)
            return half * half;
        else
            return x * half * half;
    }
}
