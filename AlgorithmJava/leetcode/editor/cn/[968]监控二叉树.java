
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    //计数
    int res = 0;

    public int minCameraCover(TreeNode root) {


        if (minCame(root)== 0){
            res++;
        }
        return res;
    }

    public int minCame(TreeNode root) {
        if (root == null) {
            //空节点默认有覆盖

            return 2;
        }
//        节点的状态值：
//        0 表示无覆盖
//        1 表示 有摄像头
//        2 表示有覆盖
        int left = minCame(root.left);
        int right = minCame(root.right);
// 如果左右节点都覆盖了的话, 那么本节点的状态就应该是无覆盖,没有摄像头
        if (left == 2 && right == 2) {
            //左右都覆盖的状态
            return 0;
        } else if (left == 0 || right == 0) {
            // 左右节点都是无覆盖状态,那 根节点此时应该放一个摄像头
            // (0,0) (0,1) (0,2) (1,0) (2,0)
            // 状态值为 1 摄像头数 ++;
            res++;
            return 1;
        } else {

            return 2;

        }


    }
}
//leetcode submit region end(Prohibit modification and deletion)
