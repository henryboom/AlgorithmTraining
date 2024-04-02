//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。 
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = "23"
//输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// 示例 2： 
//
// 
//输入：digits = ""
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：digits = "2"
//输出：["a","b","c"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= digits.length <= 4 
// digits[i] 是范围 ['2', '9'] 的一个数字。 
// 
//
// Related Topics 哈希表 字符串 回溯 👍 2682 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:电话号码的字母组合
class P17LetterCombinationsOfAPhoneNumber{
    public static void main(String[] args){
        Solution solution = new P17LetterCombinationsOfAPhoneNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        //设置全局列表存储最后的结果
        List<String> list = new ArrayList<>();
        //传入的是按下的数字
    public List<String> letterCombinations(String digits) {
//判断终止条件，递归到digits为空就结束
        if(digits==null||digits.length()==0){
            return list;
        }
        //设置字典，对应2-9的字母，前方设置两个空字符串占位
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
//        传入数字，字典和初始遍历的计数器
        backTracking(digits, numString, 0);
        return list;
    }

        //每次迭代获取一个字符串，所以会设计大量的字符串拼接，所以这里选择更为高效的 StringBuild
        StringBuilder temp = new StringBuilder();
        //比如digits如果为"23",num 为0，则str表示2对应的 abc
        public void backTracking(String digits, String[] numString, int num) {
            //遍历全部一次记录一次得到的字符串
            if (num == digits.length()) {
                list.add(temp.toString());
                return;
            }
            //str 表示当前num对应的字母表
            String str = numString[digits.charAt(num) - '0'];
            for (int i = 0; i < str.length(); i++) {
//                开始遍历，在temp后面追加
                temp.append(str.charAt(i));
                //这里的num表示的是当前的步数，也就是遍历到哪一个数字了，当num == digits.length()，则终止
                backTracking(digits, numString, num + 1);
                //剔除末尾的继续尝试
                temp.deleteCharAt(temp.length() - 1);
            }
        }
}

//leetcode submit region end(Prohibit modification and deletion)

}