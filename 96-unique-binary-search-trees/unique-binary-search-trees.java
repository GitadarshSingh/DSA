class Solution {
    public int numTrees(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            long total = 0;
            for (int left = 0; left < i; left++) {
                int right = i - 1 - left;
                total += dp[left] * dp[right];
            }
            dp[i] = total;
        }

        return (int) dp[n];
    }
}
