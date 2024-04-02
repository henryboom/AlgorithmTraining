//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。 
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
//
// Related Topics 回溯 👍 1529 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:组合
class P77Combinations{
    public static void main(String[] args){
        Solution solution = new P77Combinations().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        //回溯法的经典
        //创建返回对象
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<Integer> path = new ArrayList<>();
        void backtracking(int n,int k,int startIndex){
            //终止条件，路径中以及有k个数字后就存入result然后返回
            if (path.size()==k){
//                result.add(path);
//                result.add(path);使用这样为何没有获取到值
//                如果你使用 result.add(path) 而没有获取到正确的值，问题可能是
//                因为 path 在后续的递归调用中发生了修改，而 result 中保存的仍然是对相同 path 对象的引用。
//                这会导致 result 中的每个列表都实际上是相同的对象，它们具有相同的引用，因此无法正确地表示不同的解。
//
//                为了解决这个问题，你需要确保在将 path 添加到 result 之前创建一个副本，
//                这样 result 中的每个列表都将是独立的对象，不会相互影响。使用 new ArrayList<>(path)
//                可以创建 path 的副本，然后将副本添加到 result，确保每个解都是正确的。
                result.add(new ArrayList<>(path));

                return ;
            }

//            for (int i = startIndex; i <= n; i++)
            //剪枝不必要的步骤，提前判断需要走的path是否满足k个，已知元素不满足则不进入循环递归
            //在集合n中至多要从该起始位置 : n - (k - path.size()) + 1，开始遍历
                for (int i = startIndex; i <= n - (k - path.size()) + 1; i++)

                {
                path.add(i); // 将元素添加到 path
                backtracking(n, k, i + 1); // 递归调用下一层
                path.remove(path.size() - 1); // 递归返回后移除添加的元素，实现状态还原
            }

        }

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k,1);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}