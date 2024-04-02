//给你二叉树的根节点 root ，返回它节点值的 前序 遍历。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,null,2,3]
//输出：[1,2,3]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 示例 4： 
// 
// 
//输入：root = [1,2]
//输出：[1,2]
// 
//
// 示例 5： 
// 
// 
//输入：root = [1,null,2]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：递归算法很简单，你可以通过迭代算法完成吗？ 
//
// Related Topics 栈 树 深度优先搜索 二叉树 👍 1167 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//java:二叉树的前序遍历
class P144BinaryTreePreorderTraversal{
    public static void main(String[] args){
        Solution solution = new P144BinaryTreePreorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    //递归法
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<Integer>();
//        preorder(root, result);
//        return result;
//    }
//    public void preorder(TreeNode root, List<Integer> result) {
//        if (root == null) {
//            return;
//        }
//        result.add(root.val);
//        preorder(root.left, result);
//        preorder(root.right, result);
//    }
    public List<Integer> preorderTraversal(TreeNode root) {
        //创建列表作为结果
        List<Integer> result = new ArrayList<Integer>();

        //设置终止条件
        if (root == null){return  result;}
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
//            每一次将栈顶元素弹出加入结果列表
            TreeNode node = stack.pop();
            result.add(node.val);
            //如果右子树则右子树入栈，因为到时候是按中左右 的顺序输出，所以中弹出之后，
            //先右先压栈，右最后再弹出
            if (node.right!=null){
                stack.push(node.right);
            }
            if(node.left !=null){
                stack.push(node.left);
            }

        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}