import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] reconstructQueue(int[][] people) {


        //首先根据元素第一位排序
        Arrays.sort(people,(a,b)->{
            if (a[0]==b[0]){
                return a[1]-b[1];//前减去后是升序排列

            }
            return  b[0]-a[0];
        });
        LinkedList<int[]> que = new LinkedList<>();
        for (int[] p : people) {
            que.add(p[1],p);   //Linkedlist.add(index, value)，會將value插入到指定index裡。
        }

        return que.toArray(new int[people.length][]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
