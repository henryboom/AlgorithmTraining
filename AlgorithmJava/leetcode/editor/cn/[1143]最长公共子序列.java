
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {


    private char[] s,t;
    private int[][] cache;
    public int longestCommonSubsequence(String text1, String text2) {
        s=text1.toCharArray();
        t= text2.toCharArray();

        int n = s.length,m=t.length;

        cache = new int[n][m];

        for( int []row:cache){
            Arrays.fill(row,-1);
        }

        return dfs(n-1,m-1);

    }

    private int dfs(int i,int j)   {
        if(i<0 ||j<0) return 0;
        if(cache[i][j]!=-1) return cache[i][j];//缓存记忆

        if(s[i]==t[j]){
            return cache[i][j] = dfs(i-1,j-1)+1;
        }
        //不相等的情况处理
        return cache[i][j] = Math.max(dfs(i-1,j),dfs(i,j-1));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
