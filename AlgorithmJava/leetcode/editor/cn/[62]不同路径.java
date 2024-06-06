
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int uniquePaths(int m, int n) {

        //这里没注意，初始化错了，m和n需要互换一下，不过也不影响
        int[][] dp = new int[n][m];
        //初始化已知的变量，也就是边界的格子，必然只有一条路到达
        for (int i = 0; i < n; i++) {
            dp[i][0] =1;
        }
        for (int i = 0; i < m; i++) {
            dp[0][i]=1;
        }

        for (int i = 1; i < n; i++) {
            for(int j =1;j<m  ; j++)
                dp[i][j] = dp[i-1][j] + dp[i][j-1];



        }

        return dp[n-1][m-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
