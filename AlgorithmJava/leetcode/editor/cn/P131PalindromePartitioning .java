//给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。 
//
// 回文串 是正着读和反着读都一样的字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "aab"
//输出：[["a","a","b"],["aa","b"]]
// 
//
// 示例 2： 
//
// 
//输入：s = "a"
//输出：[["a"]]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 16 
// s 仅由小写英文字母组成 
// 
//
// Related Topics 字符串 动态规划 回溯 👍 1681 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:分割回文串
class P131PalindromePartitioning{
    public static void main(String[] args){
        Solution solution = new P131PalindromePartitioning().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();

        Boolean isPalindrome(String s, int StartIndex, int end) {
            for (int i = StartIndex,j=end; i < j; i++,j--) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
            }
            return true;
        }
        void backtraking( String s, int StartIndex) {
            //书写终止条件
            if (StartIndex>=s.length()){
                result.add(new ArrayList<>(path));
                return;
            }
            for (int i = StartIndex; i < s.length(); i++) {
//                判断截取的字符串是否为回文，这里在外部书写一个回调函数isPalindrome
                if (isPalindrome(s, StartIndex, i)) {
                    //判断为回文，截取这个串压入路径列表
                    // 子字符串从指定的beginIndex开始，并扩展到索引endIndex - 1处的字符，所以为了取到i,endIndex设置为i+1
                    String str = s.substring(StartIndex, i + 1);
                    path.add(str);
                }else {
                    continue;
                }
                //上面判断若不是回文串则不进入递归，寻找下一个循环截取
                backtraking(s, i + 1);
                path.remove(path.size() - 1);


            }
        }
    public List<List<String>> partition(String s) {
//每一次分割，都进行回文数判断，回溯的终止条件就是分割完毕或者分到最后一个串不符合条件
        backtraking(s, 0);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}