//找出所有相加之和为 n 的 k 个数的组合，且满足下列条件： 
//
// 
// 只使用数字1到9 
// 每个数字 最多使用一次 
// 
//
// 返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。 
//
// 
//
// 示例 1: 
//
// 
//输入: k = 3, n = 7
//输出: [[1,2,4]]
//解释:
//1 + 2 + 4 = 7
//没有其他符合的组合了。 
//
// 示例 2: 
//
// 
//输入: k = 3, n = 9
//输出: [[1,2,6], [1,3,5], [2,3,4]]
//解释:
//1 + 2 + 6 = 9
//1 + 3 + 5 = 9
//2 + 3 + 4 = 9
//没有其他符合的组合了。 
//
// 示例 3: 
//
// 
//输入: k = 4, n = 1
//输出: []
//解释: 不存在有效的组合。
//在[1,9]范围内使用4个不同的数字，我们可以得到的最小和是1+2+3+4 = 10，因为10 > 1，没有有效的组合。
// 
//
// 
//
// 提示: 
//
// 
// 2 <= k <= 9 
// 1 <= n <= 60 
// 
//
// Related Topics 数组 回溯 👍 777 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:组合总和 III

class P216CombinationSumIii{
    public static void main(String[] args){
        Solution solution = new P216CombinationSumIii().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        void backtracking( int k, int targetSum,int startIndex, int sum){
            // 减枝
            if (sum > targetSum) {
                return;
            }
            if (path.size() == k) {
                //将路径拷贝到result
                if (sum == targetSum) {
                    result.add(new ArrayList<>(path));
                }
                return; // 如果path.size() == k 但sum != targetSum 直接返回
            }
            //这里时<=不然定位不到9  45的情况
            for (int i = startIndex; i <= 9-(k-path.size())+1; i++) {
                //相比77题，终止条件变为了判断值和位数
                sum += i;
                path.add(i);
                backtracking( k, targetSum,i + 1, sum); // 递归时更新startIndex
                sum -= i;
                path.remove(path.size() - 1);

            }
        }

    public List<List<Integer>> combinationSum3(int k, int n) {

        backtracking(k, n, 1, 0);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}