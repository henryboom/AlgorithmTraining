import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //回溯
    static final int SEG_COUNT=4;
    List<String> ans = new ArrayList<>();
    int[] segments = new int[SEG_COUNT];
    public List<String> restoreIpAddresses(String s) {

        segments=new int[SEG_COUNT];
        dfs(s,0,0);

        return ans;
    }

    public  void dfs(String s,int segId,int segStart){

//        如果满足四段就说合法的完成了一次切分
        if (segId==SEG_COUNT){
            if (segStart==s.length()){
                StringBuilder ipAddr = new StringBuilder();
                for (int i = 0; i < SEG_COUNT; i++) {
                    ipAddr.append(segments[i]);
                    if (i!=SEG_COUNT-1){
                        ipAddr.append('.');
                    }
                }
                ans.add(ipAddr.toString());
            }
            return;
        }

        //如果 未找到4段ip地址已经遍历完了字符串，提前结束
        if (segStart==s.length()){
            return;
        }
        //由于没有前导零，所以遇到零开头的话那么只能是0独自一段
        if (s.charAt(segStart)=='0'){
            segments[segId]=0;
            dfs(s,segId+1,segStart+1);
        }

        //一般情况
        int addr=0;
        for (int segEnd = segStart; segEnd < s.length(); ++segEnd) {
            addr=addr*10+s.charAt(segEnd)-'0';
            if (addr>0&&addr<=0xff){
                segments[segId]=addr;
                dfs(s,segId+1,segEnd+1);
            }
            else break;
        }
}

}
//leetcode submit region end(Prohibit modification and deletion)
