
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minCostClimbingStairs(int[] cost) {


        int len = cost.length;
        int[] dp = new int[len+1];
        dp[0] =0;
        dp[1]=0;

        //计算每一层的最小费用
        for (int i = 2; i <= len; i++) {
            dp[i] =Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);

        }
        return dp[len];

    }
}
//leetcode submit region end(Prohibit modification and deletion)
