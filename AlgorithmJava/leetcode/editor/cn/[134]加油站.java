
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
//1.贪心1
        int sum =0;
        int min = 0;
        for (int i = 0; i < gas.length; i++) {
            sum+=(gas[i]-cost[i]);
            min = Math.min(sum,min);
        }
        if (sum < 0) return -1;
        if (min >= 0) return 0;

        for (int i = gas.length - 1; i > 0; i--) {
            min += (gas[i] - cost[i]);
            if (min >= 0) return i;
        }

        return -1;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
