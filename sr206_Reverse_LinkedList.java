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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        ListNode next = temp.next;
        ListNode prev = null;
        while(next != null) {
            prev = temp;
            temp = next;
            next = temp.next;
            temp.next = prev;
            prev = temp;
        } 
        head.next = null;
        head = temp;
        return head;
    }
}
