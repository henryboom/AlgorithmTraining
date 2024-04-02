//给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位
//。 
//
// 返回 滑动窗口中的最大值 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
//输出：[3,3,5,5,6,7]
//解释：
//滑动窗口的位置                最大值
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7
// 
//
// 示例 2： 
//
// 
//输入：nums = [1], k = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 1 <= k <= nums.length 
// 
//
// Related Topics 队列 数组 滑动窗口 单调队列 堆（优先队列） 👍 2572 👎 0

package leetcode.editor.cn;

import java.util.Deque;
import java.util.LinkedList;

//java:滑动窗口最大值
class P239SlidingWindowMaximum{
    public static void main(String[] args){
        Solution solution = new P239SlidingWindowMaximum().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    //自定义一个单调队列
    class MyQueue{
        Deque<Integer> deque =new LinkedList<>();
        //弹出元素时，比较当前要弹出的数值是否等于队列出口的数值，如果相等则弹出
        //同时判断队列当前是否为空

        void poll(int val){
            //如果队列非空而且想要弹出的元素为队头元素
            if (!deque.isEmpty()&&val == deque.peek()){
                deque.poll();
            }
        }
        //添加元素时，如果要添加的元素大于入口处的元素，就将入口元素弹出
        //保证队列元素单调递减
        //比如此时队列元素3,1，2将要入队，比1大，所以1弹出，此时队列：3,2
        void  add(int val){
            while (!deque.isEmpty() && val > deque.getLast()){
                //如上，我们移除了1，此处是循环移除，直到大于val才截止
                deque.removeLast();
            }
            //上面的循环是将所有小于要添加的元素val全部移除
            deque.add(val);//这样我们就封装好了我们需要的添加方法
        }
        //队列队顶元素始终为最大值
        int peek() {
            //检索但不移除此双端队列表示的队列的头部
            return deque.peek();
        }
    }
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length ==1){
            return  nums;
        }
        int len = nums.length-k+1;
        //存放结果元素数组
        int[] res = new int[len];
        int num= 0;
        //声明自定义队列
        MyQueue myQueue = new MyQueue();
        //将前k个元素加入队列
        for (int i= 0;i<k;i++){
            myQueue.add(nums[i]);
        }
        //结果数组只需要一直取队头元素
        res[num++]=myQueue.peek();
        for (int i = k; i < nums.length; i++) {
            //滑动窗口移除最前面的元素，若他处于单调队列的队头，则移除
            myQueue.poll(nums[i - k]);
            //滑动窗口加入最后面的元素
            myQueue.add(nums[i]);
            //记录对应的最大值
            res[num++] = myQueue.peek();
        }
        return  res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}