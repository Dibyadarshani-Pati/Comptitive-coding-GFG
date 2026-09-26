class Solution {
    public int minimumCost(int x, int s, int m, int l, int cs, int cm, int cl) {
        // dp[i] = minimum cost to get area i
        int[] dp = new int[x + Math.max(s, Math.max(m, l)) + 1];

        // Initialize with large value
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE / 2;
        }
        dp[0] = 0; // base case: 0 area costs 0

        // Fill DP using while-loops
        int i = 0;
        while (i < dp.length) {
            if (dp[i] != Integer.MAX_VALUE / 2) {
                if (i + s < dp.length) dp[i + s] = Math.min(dp[i + s], dp[i] + cs);
                if (i + m < dp.length) dp[i + m] = Math.min(dp[i + m], dp[i] + cm);
                if (i + l < dp.length) dp[i + l] = Math.min(dp[i + l], dp[i] + cl);
            }
            i++;
        }

        // Find minimum cost for area >= x
        int ans = Integer.MAX_VALUE;
        int j = x;
        while (j < dp.length) {
            ans = Math.min(ans, dp[j]);
            j++;
        }

        return ans;
    }
}
