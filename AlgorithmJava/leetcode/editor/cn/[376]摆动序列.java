
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int wiggleMaxLength(int[] nums) {
    if(nums.length<=1){
        //返回长度即可
        return nums.length;
    }
    //记录当前差值
        int curDiff=0;
    //上一个差值
        int preDiff=0;
        int count=1;
        for (int i=1;i<nums.length;i++){
            //获取当前差值
            curDiff=nums[i]-nums[i-1];
            //判断当前差值与上一个差值符号是否相同
            //等于零的情况，表示初始时的preDiff
            if(curDiff>0&&preDiff<=0||curDiff<0&&preDiff>=0){
                //当前差值与上一个差值符号不同，则差值+1
                count++;
                preDiff=curDiff;
            }
        }
        return count;
    }

}
//leetcode submit region end(Prohibit modification and deletion)
