/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode currentNode = headA;
        while (currentNode!= null) {
            ListNode currentNode2 = headB;
            while (currentNode2 != null) {
                if (currentNode == currentNode2) {
                    return currentNode;
                }
                currentNode2 = currentNode2.next;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
}
