class Solution {
    private static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;  // indices 0,2,4,...
        long oddCount = n / 2;         // indices 1,3,5,...

        long evenPow = power(5, evenCount);
        long oddPow = power(4, oddCount);

        return (int)((evenPow * oddPow) % MOD);
    }

    private long power(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }
}
