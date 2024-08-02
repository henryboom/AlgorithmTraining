import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //贪心
    public int maxSubArray1(int[] nums) {

        //长度为一直接返回
    if(nums.length==1){
        return nums[0];
    }
    int sum = Integer.MIN_VALUE;
    int count =0;
        for (int i = 0; i < nums.length; i++) {
            count+=nums[i];
            sum = Math.max(sum,count);
            //如果前面的 连续和已经为负数，那么就删除，因为不能为后续的子序列增加数值
            if (count<0){
                count=0;
            }
        }
        return sum;
    }




    //dp
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int res = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //要么接着追加，要么从当前从新开始新的子数组
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            res = res > dp[i] ? res : dp[i];
        }
        return res;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
