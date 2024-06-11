
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int integerBreak(int n) {

        //dp[i]为当前数字的i的最大的乘积
        int[] dp = new int[n + 1];

        dp[2]=  1;
        for (int i = 3; i <=n; i++) {
            for( int j=1;j<=i-j;j++){

                //
                dp[i]= Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));

            }

        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
