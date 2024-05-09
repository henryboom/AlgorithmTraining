import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {

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
}
//leetcode submit region end(Prohibit modification and deletion)
