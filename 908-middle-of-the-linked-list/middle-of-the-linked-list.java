
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head;

        while(fast != null && fast.next != null) // Only for  odd length
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
}