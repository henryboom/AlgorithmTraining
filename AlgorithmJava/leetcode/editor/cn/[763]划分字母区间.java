import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> partitionLabels(String s) {

    //创建一个空连
        LinkedList<Integer> list = new LinkedList<>();
        //创建一个字母对应的最远距离的变量对应，比如加入了a,那么必须将最远的 一个a加入才算是合理的
        int[] edge = new int[26];
        //将字符串转换为字符数组
        char[] chars = s.toCharArray();
//        开始标记

        for (int i = 0; i < chars.length; i++) {
            edge[chars[i]-'a'] = i;

        }
        int idx =0;
        //保证第一段是由下标+1的结果也就是字符的数量
        int last =-1;

        //遍历，每一次加入就同时判断一下当前分区里的最远的字母距离
        for (int i = 0; i < chars.length; i++) {
            idx = Math.max(idx,edge[chars[i]-'a']);
            if (i ==idx){
                list.add(i-last);
                last =i;

            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
