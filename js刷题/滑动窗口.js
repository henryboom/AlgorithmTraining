
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var maxSlidingWindow = function (nums, k) {
    // 自定义一个单调队列，保持队列中的元素单调递减
    class MyQueue {
        constructor() {
            this.deque = []; // 使用数组来模拟双端队列
        }

        // 弹出元素时，比较当前要弹出的数值是否等于队列出口的数值，如果相等则弹出
        poll(val) {
            if (this.deque.length > 0 && val === this.deque[0]) {
                this.deque.shift(); // 移除队列前端的元素
            }
        }

        // 添加元素时，如果要添加的元素大于入口处的元素，就将入口元素弹出
        // 保证队列元素单调递减
        add(val) {
            while (this.deque.length > 0 && val > this.deque[this.deque.length - 1]) {
                this.deque.pop(); // 移除队列尾部的元素
            }
            this.deque.push(val); // 将新的值加入队列尾部
        }

        // 队列队顶元素始终为最大值
        peek() {
            return this.deque[0]; // 返回队列的头部元素，但不移除
        }
    }

    if (nums.length == 1) return nums;

    let res = [];
    let Q = new MyQueue();

    // 先将前 k 个元素入队
    for (let i = 0; i < k; i++) {
        Q.add(nums[i]);
    }
    res.push(Q.peek());

    // 开始滑动窗口
    for (let i = k; i < nums.length; i++) {
        Q.poll(nums[i - k]); // 移除滑动窗口的左端元素
        Q.add(nums[i]);      // 添加滑动窗口的右端新元素
        res.push(Q.peek());  // 将当前窗口的最大值加入结果数组
    }

    return res;
};

// 示例调用
console.log(maxSlidingWindow([1, 3, -1, -3, 5, 3, 6, 7], 3));