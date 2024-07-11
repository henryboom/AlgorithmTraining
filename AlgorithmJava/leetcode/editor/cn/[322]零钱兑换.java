
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[amount+1];

        //初始化为最大值
        for (int j =0 ;j<dp.length;j++){
            dp[j] = max;
        }

        dp[0] =0 ;
        for(int i=0;i<coins.length;i++){ //遍历物品，组合数
            for (int j = coins[i];j<=amount ;j++){
                //求组成金额的 最小的 硬币的数量
                //coins 表示物品数组
            if (dp[j-coins[i]]!=max)
                    dp[j] =Math.min(dp[j],dp[j-coins[i]]+1);
            }
        }
        return dp[amount]==max?-1:dp[amount];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
