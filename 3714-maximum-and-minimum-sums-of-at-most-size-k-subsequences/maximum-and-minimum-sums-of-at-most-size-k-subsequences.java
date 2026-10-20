class Solution {
    public int minMaxSums(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        long MOD = 1000000007;

        // dp[i] = number of ways to choose elements
        // from i elements
        long[][] dp = new long[n + 1][k];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < k; j++) {
                dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % MOD;
            }
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {

            // nums[i] is the MINIMUM
            // choose up to k-1 elements from its right
            for (int j = 0; j < k && j <= n - i - 1; j++) {
                ans = (ans + nums[i] * dp[n - i - 1][j]) % MOD;
            }

            // nums[i] is the MAXIMUM
            // choose up to k-1 elements from its left
            for (int j = 0; j < k && j <= i; j++) {
                ans = (ans + nums[i] * dp[i][j]) % MOD;
            }
        }

        return (int) ans;
    }
}