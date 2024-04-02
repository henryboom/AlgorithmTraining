//给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的
// 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。 
//
// candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。 
//
// 对于给定的输入，保证和为 target 的不同组合数少于 150 个。 
//
// 
//
// 示例 1： 
//
// 
//输入：candidates = [2,3,6,7], target = 7
//输出：[[2,2,3],[7]]
//解释：
//2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
//7 也是一个候选， 7 = 7 。
//仅有这两种组合。 
//
// 示例 2： 
//
// 
//输入: candidates = [2,3,5], target = 8
//输出: [[2,2,2,2],[2,3,3],[3,5]] 
//
// 示例 3： 
//
// 
//输入: candidates = [2], target = 1
//输出: []
// 
//
// 
//
// 提示： 
//
// 
// 1 <= candidates.length <= 30 
// 2 <= candidates[i] <= 40 
// candidates 的所有元素 互不相同 
// 1 <= target <= 40 
// 
//
// Related Topics 数组 回溯 👍 2668 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//java:组合总和
class P39CombinationSum{
    public static void main(String[] args){
        Solution solution = new P39CombinationSum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        //设置一个全局的列表来作为返回列表
        List<List<Integer>> result = new ArrayList<>();
//        创建显示当前的 路径
        List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        //sort
        Arrays.sort(candidates);

        //将传进来的数组进行累加那么，我们开始构造当前的sum,以及是否构造完成，大于就排除
        backtracking(candidates,target,0,0);
        return result;
    }

    //当前的总和为sum
    void backtracking(int[] candidates,int target,int sum, int startIndex){
//        //首先书写终止条件
        //将这个判定移到for循环内
        //放进去的条件是我们必须提前sort一下数组，不然如果后面有小于的数字就直接被剪枝了
//        if(sum>target)return;
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            //
//            if(sum>target)break;
            if (sum + candidates[i] > target) break;
            path.add(candidates[i]);
            //这里递归为i,说明可重复
            backtracking(candidates,target,sum+candidates[i],i);
            path.remove(path.size() - 1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}