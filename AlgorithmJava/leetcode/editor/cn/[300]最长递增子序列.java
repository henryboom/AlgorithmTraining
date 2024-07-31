
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
//    public int lengthOfLIS(int[] nums) {
//        int n = nums.length,ans=0;
//        int[] f = new int[n];
//
//        for(int i=0;i<n;i++){
//            //f[i]的表示在index i下的最大单增子串长度
//            for(int j=0;j<i;j++){
//                if(nums[j]<nums[i]){
//                    f[i] =Math.max(f[i],f[j]);
//                }
//            }
//            ans=Math.max(ans,++f[i]);
//        }
//        return ans;
//
//    }
    //递归写法
private int[] nums;
    private int[] memo;
public int lengthOfLIS(int[] nums) {
    this.nums = nums;
    int n = nums.length;
    memo = new int[n]; // 本题可以初始化成 0，表示没有计算过
    int ans = 0;
    for (int i = 0; i < n; i++) {
        //在dfs中返回的是 i 截止的最长递增序列
        ans = Math.max(ans, dfs(i));
    }
    return ans;
}


private  int  dfs(int i){

    if(memo[i]>0){
        //以计算过
        return memo[i];
    }
    for (int j=0;j<i;j++){
        if (nums[j]<nums[i])
            memo[i] = Math.max(memo[i] ,dfs(j));
    }
    return ++memo[i];

}

}
//leetcode submit region end(Prohibit modification and deletion)
