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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node before head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;
        ListNode curr = head;

        // Count total nodes
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // Reverse in groups of k
        while (count >= k) {
            curr = prevGroup.next;
            ListNode next = curr.next;

            // Reverse k-1 links
            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prevGroup.next;
                prevGroup.next = next;
                next = curr.next;
            }

            // Move prevGroup pointer forward
            prevGroup = curr;
            count -= k;
        }

        return dummy.next;
    }
}
