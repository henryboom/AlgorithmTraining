import java.util.Arrays;
import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        //按照左边界排序
        Arrays.sort(intervals,(x,y) -> Integer.compare(x[0],y[0]));
        //initial start 是最小边界
        int start = intervals[0][0];
        //最大右边界
        int rightmostRightBound = intervals[0][1];//默认第一个

        for (int i = 1; i < intervals.length; i++) {
            //如果左边界限 大于 最大 的右边界
            if (intervals[i][0] > rightmostRightBound){


                //加入这个区间，进行下一个区间搜索
                res.add(new int[] {start,rightmostRightBound});
                start = intervals[i][0];
                rightmostRightBound = intervals[i][1];

            }else {

                //更新最大的右边界
                rightmostRightBound = Math.max(rightmostRightBound,intervals[i][1]);
            }

        }
        res.add(new int[]{
                start,rightmostRightBound
        });
        return  res.toArray(new int[res.size()][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
