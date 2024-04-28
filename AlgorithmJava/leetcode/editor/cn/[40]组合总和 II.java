import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
void backtracking(int[] candidates, int target, int sum, int index) {
    if (sum == target) {
        res.add(new ArrayList<>(path));
        return;
    }
//    创建一个不重复集合


    Set<Integer> uset = new HashSet<>();//控制某个节点同一层的元素不能重复
    for (int i = index; i < candidates.length&&sum+candidates[i]<=target; i++) {
        if (uset.contains(candidates[i])) continue;
//        if (sum + candidates[i] > target) break;
        uset.add(candidates[i]);
        sum += candidates[i];
        path.add(candidates[i]);
        backtracking(candidates, target, sum, i + 1);
        sum -= candidates[i];
        path.remove(path.size() - 1);
    }
}

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        //数组，目标值，当前总和，当前索引
        backtracking(candidates, target, 0,0);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
