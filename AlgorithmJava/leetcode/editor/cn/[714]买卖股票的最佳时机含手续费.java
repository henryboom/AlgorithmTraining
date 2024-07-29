
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices, int fee) {
//        int n = prices.length;
//        int[][] f = new int[n + 2][2];
//        f[0][1] = Integer.MIN_VALUE / 2;
//        for (int i = 0; i < n; ++i) {
//            //卖出状态或者正在卖出
//            f[i + 1][0] = Math.max(f[i][0], f[i][1] + prices[i]-fee);
//            //持有状态
//            f[i + 1][1] = Math.max(f[i][1], f[i][0] - prices[i]);
//        }
//        return f[n][0];
        // 0 : 持股（买入）
        // 1 : 不持股（售出）
        // dp 定义第i天持股/不持股 所得最多现金
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] + prices[i] - fee, dp[i - 1][1]);
        }
        return dp[len - 1][1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
