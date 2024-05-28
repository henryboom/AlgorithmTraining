
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        ///
//        Arrays.sort(intervals, (a,b)-> {
//            return Integer.compare(a[0],b[0]);
//        });
//        int count = 1;
//        for(int i = 1;i < intervals.length;i++){
//            if(intervals[i][0] < intervals[i-1][1]){
//                intervals[i][1] = Math.min(intervals[i - 1][1], intervals[i][1]);
//                continue;
//            }else{
//                count++;
//            }
//        }
//        return intervals.length - count;
        Arrays.sort(intervals, (a,b)-> {
            return Integer.compare(a[0],b[0]);
        });
        int remove = 0;
        int pre = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            if(pre > intervals[i][0]) {
                remove++;
                pre = Math.min(pre, intervals[i][1]);
            }
            else pre = intervals[i][1];
        }
        return remove;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
