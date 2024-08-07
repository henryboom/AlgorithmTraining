
//leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int maxProfit(int[] prices) {
//        if (prices == null || prices.length < 2) {
//            return 0;
//        }
//        int[][] dp = new int[prices.length][2];
//
//        // bad case
//        dp[0][0] = 0;
//        dp[0][1] = -prices[0];
//        dp[1][0] = Math.max(dp[0][0], dp[0][1] + prices[1]);
//        dp[1][1] = Math.max(dp[0][1], -prices[1]);
//
//        for (int i = 2; i < prices.length; i++) {
//            // dp公式
//            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
//            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 2][0] - prices[i]);
//        }
//
//        return dp[prices.length - 1][0];
//    }
//}
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] f = new int[n + 2][2];
        f[1][1] = Integer.MIN_VALUE;
        for (int i = 0; i < n; ++i) {
            f[i + 2][0] = Math.max(f[i + 1][0], f[i + 1][1] + prices[i]);
            f[i + 2][1] = Math.max(f[i + 1][1], f[i][0] - prices[i]);
        }
        return f[n + 1][0];
    }
}

//leetcode submit region end(Prohibit modification and deletion)
