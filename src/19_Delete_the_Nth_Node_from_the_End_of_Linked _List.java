/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    //     暴力解法
    //     ListNode current = head;
    //     int count  = 0;
    //     while (current != null) {
    //         current = current.next;
    //         count += 1;
    //     }
    //     if (n>count) {
    //         return head;
    //     }
    //     if (count == n) {
    //         head = head.next;
    //         return head;
    //     }
    //     int targetIndex = count - n;
    //     count = 0;
    //     ListNode prev = null;
    //     current = head;
    //     while (count!= targetIndex) {
    //         prev = current;
    //         current = current.next;
    //         count += 1;
    //     }
    //     prev.next = current.next;
    //     return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast  = dummy;
        ListNode slow  = dummy;
        n += 1;
        while (n != 0 && fast != null) {
            fast = fast.next;
            n-=1;
        }
        if (n != 0) {
            return head;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
