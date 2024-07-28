
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[][] f = new int[n + 2][2];
        f[0][1] = Integer.MIN_VALUE / 2;
        for (int i = 0; i < n; ++i) {
            //卖出状态或者正在卖出
            f[i + 1][0] = Math.max(f[i][0], f[i][1] + prices[i]-fee);
            //持有状态
            f[i + 1][1] = Math.max(f[i][1], f[i][0] - prices[i]);
        }
        return f[n][0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
