
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length()+1][t.length()+1];

        //初始化
        for (int i = 0;i<s.length();i++){
            dp[i][0] = 1;
        }
        for(int i =1;i<s.length()+1;i++){
            for (int j = 1; j < t.length() + 1; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    //相等的情况，来自于不含当前对比字符的最多个数，
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }

        }
        return dp[s.length()][t.length()];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
