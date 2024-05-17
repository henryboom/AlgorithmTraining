
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int candy(int[] ratings) {

        int len = ratings.length;

        int[] candyVec = new int[len];//创建糖果分发的数组
        candyVec[0]=1 ;//假设是1，就算右边更小，第二次循环会优化
        //首先前到后遍历，右边大于左边，则右边加1
        for (int i = 1; i < len; i++) {
            candyVec[i]= ratings[i] > ratings[i - 1] ? candyVec[i - 1] + 1 : 1;
        }
        //再次后到前遍历，zuo边大于右边，左边加1
        for (int i = len -2;i>=0;i--){
            if (ratings[i]>ratings[i+1]){
                candyVec[i] = Math.max(candyVec[i],candyVec[i+1]+1);//因为这里选取最大，是需要满足右边大于左边为先的

            }
        }

        int ans = 0;
        for (int num : candyVec){
            ans+=num;
        }
        return ans;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
