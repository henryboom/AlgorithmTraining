
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        int n = nums.length;

        //求和
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
//
        //求和为奇数，不能平分
        if (sum % 2 != 0) {
            return false;
        }
        //背包容量
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < n; i++) {//遍历数组元素
            for (int j = target; j >= nums[i]; j--) {//每一个元素在不同背包容量之下的最大价值
                //物品的重量为nums[i],价值为nums[i]
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
            //剪枝优化，当每一次遍历价值之后，判断终止条件dp[target]==target
            if (dp[target] == target) {
                return true;
            }
        }
        return dp[target] == target;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
