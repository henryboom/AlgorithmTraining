import java.util.Arrays;
import java.util.stream.IntStream;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
            nums= IntStream.of(nums)
                    .boxed()
                    .sorted((o1, o2) -> Math.abs(o2) - Math.abs(o1))
                    .mapToInt(Integer::intValue).toArray();

            int len = nums.length;
        for (int i = 0; i < len; i++) {
            //从前往后遍历 绝对值最大的负数
            if (nums[i]<0&&k>0){
                nums[i]=-nums[i];
                k--;
            }
        }
        //如果k还是大于零，那么就用绝对值最小的数消耗掉
        if(k%2==1)nums[len-1]=-nums[len-1];
        return Arrays.stream(nums).sum();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
