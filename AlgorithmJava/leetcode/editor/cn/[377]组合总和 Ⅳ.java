
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int combinationSum4(int[] nums, int target) {
            int[] dp = new  int[target+1];
            dp[0] =1 ;
            //求的是排列数，背包为外层循环
            for(int i= 0;i<= target; i++){
                for (int j= 0; j< nums.length;j++){
                    if (i>=nums[j])
                        dp[i] +=dp[i-nums[j]];

                }
            }
            return dp[target];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
