import static java.lang.Math.max;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int result =0;

        for (int i = 1; i < prices.length; i++) {
            result+=Math.max(prices[i]-prices[i-1],0);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
