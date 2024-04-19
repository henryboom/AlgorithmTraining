import java.util.LinkedList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    //定义一个二维数组存放结果
    List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {

//        定义一个路径数组
        List<Integer> track = new LinkedList<>();
        backtrack(nums,0,track);
        return res;
    }

    public void backtrack(int[] nums,int start,List<Integer> track){

        //添加路径数组到结果集中
        res.add(new LinkedList<>(track));
//        循环nums数组
        for (int i = start; i < nums.length; i++) {
//            添加元素到路径数组
            track.add(nums[i]);
//            递归
            backtrack(nums,i+1,track);
//            回溯
            track.remove(track.size()-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
