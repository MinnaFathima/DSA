/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // move slow by 1 step
            fast = fast.next.next;    // move fast by 2 steps

            if (slow == fast) {       // they meet → cycle exists
                return true;
            }
        }

        return false; // fast reached the end → no cycle
    }
}
