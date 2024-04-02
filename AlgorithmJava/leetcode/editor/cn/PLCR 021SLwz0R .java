//给定一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 
//
// 示例 1： 
//
// 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
//
// 进阶：能尝试使用一趟扫描实现吗？ 
//
// 
//
// 
// 注意：本题与主站 19 题相同： https://leetcode-cn.com/problems/remove-nth-node-from-end-
//of-list/ 
//
// Related Topics 链表 双指针 👍 87 👎 0

package leetcode.editor.cn;

import java.util.List;

//java:删除链表的倒数第 N 个结点
class PLCR 021SLwz0R {
    public static void main(String[] args){
        Solution solution = new PLCR 021SLwz0R().new Solution();
    }
}
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 */
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 创建虚拟节点dummy
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // 获取链表长度
        int length = getLength(head);
        // 指向虚拟头节点
        ListNode cur = dummy;
        // 找到要删除的节点的前一个节点
        for (int i = 0; i < length - n; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }

    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}