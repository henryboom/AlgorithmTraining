import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMinArrowShots(int[][] points) {
        //根据气球的直径进行从小到大排序
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));

        //初始化至少需要一支箭
        int count =1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i-1][1]){
                //前一个的气球的最右边和后一个 的最左边不重叠
                count++;

            }else {
                //更新最小的 能满足引爆重叠气球的最小的 index
                points[i][1]=Math.min(points[i][1],points[i-1][1]);

            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
