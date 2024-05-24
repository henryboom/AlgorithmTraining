
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        ///
        Arrays.sort(intervals, (a,b)-> {
            return Integer.compare(a[0],b[0]);
        });

    }
}
//leetcode submit region end(Prohibit modification and deletion)
