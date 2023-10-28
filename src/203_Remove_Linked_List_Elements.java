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
    public ListNode removeElements(ListNode head, int val) {
    /*
    /* normal solution
     **/
    //     while(head != null && head.val == val) {
    //         head = head.next;
    //     }
    //     ListNode current = head;
    //     while (current != null && current.next != null) {
    //         if (current.next.val == val) {
    //             current.next = current.next.next;
    //         }
    //         else {
    //             current = current.next;
    //         }
    //     }
    //     return head;
    // }
    
    /*
    /* dummy node
     **/

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        head = dummy.next;
        return head;
    }
}
