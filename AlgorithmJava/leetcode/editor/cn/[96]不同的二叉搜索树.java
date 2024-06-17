
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numTrees(int n) {

        //初始化dp数组
        int[] dp = new int[n + 1];

        dp[0]=1;
        dp[1]=1;
        //新增一个节点作为头节点，不同的只是在组合自己的左右子树的数量，将所有所有子树的不同形状都求和
        //也就是说可以一开始右边子树为空，然后一次拿左边一个节点到右边子树，子树的搜素数的值取决于上一次 的dp搜索
        //
        for (int i = 2; i <=n; i++) {
            for (int j=1;j<=i;j++){
                //对于第i个节点，需要考虑1作为根节点直到i作为根节点的情况，所以需要累加
                //一共i个节点，对于根节点j时,左子树的节点个数为j-1，右子树的节点个数为i-j
                dp[i] += dp[j - 1] * dp[i - j];
            }

        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
