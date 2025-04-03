// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
//     }
// }
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null) {
            // Get the current values, default to 0 if the node is null
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // Calculate the sum and carry
            int sum = carry + x + y;
            carry = sum / 10;

            // Create a new node with the digit value of sum
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in l1 and l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Check if there's any carry left
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the next node of dummyHead, as it points to the head of the result list
        return dummyHead.next;
    }
}
