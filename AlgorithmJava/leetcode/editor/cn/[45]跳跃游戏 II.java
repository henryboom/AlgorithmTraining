
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }
    //记录当前跳跃的cishu
        int count =0;
        //记录当前的最大覆盖
        int curDistance =0;
        //最大的覆盖区域
        int maxDistance = 0;
        //进行遍历，找出每一次范围选择中能跳跃的 最大距离，达到了则刷新新的最大距离
        for (int i = 0; i < nums.length; i++) {
            //在当前可覆盖的范围刷新最大的覆盖范围
            maxDistance=Math.max(maxDistance,i+nums[i]);
            //说明当前的步数已经达到了末尾，再跳就成功
            if (maxDistance>=nums.length-1){
                count++;
                break;
            }
            if (i==curDistance){
//                已经到了前一跳的最大范围，需要更新可达的最大范围
                curDistance=maxDistance;
                count++;
            }

        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
