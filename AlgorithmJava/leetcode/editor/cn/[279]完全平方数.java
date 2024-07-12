
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSquares(int n) {
        int max = Integer.MAX_VALUE;
        int[] dp = new int[n + 1];
        //初始化
        for (int j = 0; j <= n; j++) {
            dp[j] = max;
        }
        //如果不想要寫for-loop填充數組的話，也可以用JAVA內建的Arrays.fill()函數。
        //Arrays.fill(dp, Integer.MAX_VALUE);

        //当和为0时，组合的个数为0
        dp[0] = 0;
        // 遍历物品,1.4.9...
        for (int i =1;i*i <=n;i++){//物品
            for (int j= i*i;j<=n;j++){//背包大小
                dp[j] = Math.min(dp[j],dp[j-i*i]+1);
            }
        }

        return  dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
