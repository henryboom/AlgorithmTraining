
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canJump(int[] nums) {
        //设置一个每一次选择的最大范围cover
        int cover =0;
        if (nums.length==1)
            return true;
        for (int i = 0; i <=cover; i++) {//小于等于
            cover=Math.max(nums[i]+i, cover);
            if (cover>=nums.length-1)return true;//表示覆盖到了终点
//
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
