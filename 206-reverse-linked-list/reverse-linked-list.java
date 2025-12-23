class Solution {
    public ListNode reverseList(ListNode head) {
        //iteratevly
        ListNode current = head;
        ListNode previous = null;
        // ListNode next = current.next;

        while(current != null)
        {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            
        }
        return previous;
    }
}