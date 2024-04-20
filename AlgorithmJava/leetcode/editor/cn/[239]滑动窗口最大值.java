import java.util.Deque;
import java.util.LinkedList;

//
////leetcode submit region begin(Prohibit modification and deletion)
//
//
//
////自定义一个单调队列
//
//import org.junit.jupiter.api.Test;
//
//import java.util.Deque;
//import java.util.LinkedList;
//
//class MyQueue {
//    Deque<Integer> deque=new LinkedList<>();
//    //弹出元素的时候，比较弹出元素的值是否等于队列的出口的值，如果相等就弹出
//    //增加条件判断队列是否为空
//    void  poll(int val){
//        if (!deque.isEmpty()&&val==deque.peek()){
//            deque.poll();
//        }
//    }
//    //添加元素，如果在该元素前的元素小于末尾的新加入的元素，则删除掉，
//    // 保证队列单调
//    //比如  此时队列为3，1，  2即将入队，那么比1大，此时就将之前比2 小的元素删除
//    void add(int val){
//        while (!deque.isEmpty()&&val>deque.getLast()){
//            //如上，从末尾开始移除元素
//            deque.removeLast();
//
//        }
//    }
//
//    //当然也需要获取一下最大元素的方法，
//    int peek(){
//        return deque.peek();
//    }
//}
//class Solution {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if (nums.length==1){
//            return nums;
//        }
//
//        int len=nums.length-k+1;
//        int[] res =new int[len];
//        int num=0;
//        //声明创建的队列
//        MyQueue myQueue = new MyQueue();
////        将前k个元素加入队列
//        for (int i=0;i<k;i++){
//            myQueue.add(nums[i]);
//        }
//        //结果数组一直取头元素即可
//        res[num++]=myQueue.peek();
//        for (int i = k; i < nums.length; i++) {
//                //滑动窗口，移除前面的元素，移除时判断该元素是否在队列中的首位
//            myQueue.poll(nums[i-k]);
//            //滑动窗口加入最后面的元素
//            myQueue.add(nums[i]);
//            //记录对应的最大值
//            res[num++]=myQueue.peek();
//
//
//        }
//        return res;
//    }
//
//}
////leetcode submit region end(Prohibit modification and deletion)
//自定义一个单调队列
class MyQueue{
    Deque<Integer> deque =new LinkedList<>();
    //弹出元素时，比较当前要弹出的数值是否等于队列出口的数值，如果相等则弹出
    //同时判断队列当前是否为空
    void poll(int val){
        if (!deque.isEmpty()&&val == deque.peek()){
            deque.poll();
        }
    }
    //添加元素时，如果要添加的元素大于入口处的元素，就将入口元素弹出
    //保证队列元素单调递减
    //比如此时队列元素3,1，2将要入队，比1大，所以1弹出，此时队列：3,2
    void  add(int val){
        while (!deque.isEmpty() && val > deque.getLast()){
            //如上，我们移除了1
            deque.removeLast();
        }
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
            //滑动窗口移除最前面的元素，移除时判断该元素是否放入队列
            //相等则弹出
            myQueue.poll(nums[i - k]);
            //滑动窗口加入最后面的元素
            myQueue.add(nums[i]);
            //记录对应的最大值
            res[num++] = myQueue.peek();
        }
        return  res;
    }
}
