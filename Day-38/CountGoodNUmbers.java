class Solution {
    static final long MOD = 1000000007;

    // Recursive modular exponentiation
    private long modPow(long base, long exp) {
        if (exp == 0)
            return 1;
        
        long half = modPow(base, exp / 2);
        long result = (half * half) % MOD;
        
        if (exp % 2 == 1)
            result = (result * base) % MOD;
        
        return result;
    }

    public int countGoodNumbers(long n) {
        long count_even = (n + 1) / 2; // number of even indices
        long count_odd = n / 2;        // number of odd indices

        long even_part = modPow(5, count_even);
        long odd_part = modPow(4, count_odd);

        long result = (even_part * odd_part) % MOD;
        return (int) result; // safe cast since result < MOD
    }
}