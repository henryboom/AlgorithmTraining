//给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,1,1,2,2,3], k = 2
//输出: [1,2]
// 
//
// 示例 2: 
//
// 
//输入: nums = [1], k = 1
//输出: [1] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// k 的取值范围是 [1, 数组中不相同的元素的个数] 
// 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的 
// 
//
// 
//
// 进阶：你所设计算法的时间复杂度 必须 优于 O(n log n) ，其中 n 是数组大小。 
//
// Related Topics 数组 哈希表 分治 桶排序 计数 快速选择 排序 堆（优先队列） 👍 1724 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//java:前 K 个高频元素
class P347TopKFrequentElements{
    public static void main(String[] args){
        Solution solution = new P347TopKFrequentElements().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //创建map，k为数组中的元素的值，v为出现的 次数
        Map<Integer,Integer> map = new HashMap<>();
        //计算次数丢入map中
        for (int num:nums) {
        map.put(num,map.getOrDefault(num,0)+1);
        }
        // lambda 表达式设置优先级队列从大到小存储 o2 - o1  为从大到小，反之o1 - o2
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2)-> {
            return pair2[1] - pair1[1];
        });
        for (Map.Entry<Integer,Integer> entry :map.entrySet()
             ) {
            //遍历加入键值对，注意这里使用数组存放
        pq.add(new int[]{entry.getKey(),entry.getValue()});
        }
        //创建结果数组
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i]=pq.poll()[0];
        }
        return  ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}