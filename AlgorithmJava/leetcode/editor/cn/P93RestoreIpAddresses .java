//有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。 
//
// 
// 例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，但是 "0.011.255.245"、"192.168.1.312" 
//和 "192.168@1.1" 是 无效 IP 地址。 
// 
//
// 给定一个只包含数字的字符串 s ，用以表示一个 IP 地址，返回所有可能的有效 IP 地址，这些地址可以通过在 s 中插入 '.' 来形成。你 不能 重新
//排序或删除 s 中的任何数字。你可以按 任何 顺序返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "25525511135"
//输出：["255.255.11.135","255.255.111.35"]
// 
//
// 示例 2： 
//
// 
//输入：s = "0000"
//输出：["0.0.0.0"]
// 
//
// 示例 3： 
//
// 
//输入：s = "101023"
//输出：["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 20 
// s 仅由数字组成 
// 
//
// Related Topics 字符串 回溯 👍 1355 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:复原 IP 地址
class P93RestoreIpAddresses{
    public static void main(String[] args){
        Solution solution = new P93RestoreIpAddresses().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        List<String> result = new ArrayList<>();
        StringBuffer path;

        //一个从start-end的判断合法函数
        private boolean isValid(StringBuffer s, int start, int end) {
            if (start > end) {
                return false;
            }
            if (s.charAt(start) == '0' && start != end) {
                return false;
            }
            int num = 0;
            for (int i = start; i <= end; i++) {
                int digit = s.charAt(i) - '0';
                num = num * 10 + digit;
                if (num > 255) {
                    return false;
                }
            }
            return true;
        }


    private void backTracking(StringBuffer s,int startIndex,int dotCount){
            //记录点的个数，也是分段的数

        if (dotCount==3){
            //判断是否合法，然后加入结果集
            if (isValid(s, startIndex, s.length() - 1)) {
                result.add(String.valueOf(s));
            }
            return;
        }

        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s.insert(i + 1, '.');
                backTracking(s, i + 2, dotCount + 1);
                s.deleteCharAt(i + 1);
            } else {
                break;
            }

        }
    }
    public List<String> restoreIpAddresses(String s) {
    //ip切分，也就是说循环最多不能超过三位，而且是0-255，同样的设置一个path ，来放置存入的ip地址
        StringBuffer s1=new StringBuffer(s);
        backTracking(s1, 0, 0);
        return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}