class Solution {
    public ListNode reverseList(ListNode head) {
        //iteratevly
        // ListNode current = head;
        // ListNode previous = null;
        //  ListNode Next = head;

        // while(current != null)
        // {
        //     Next = current.next;
        //     current.next = previous;
        //     previous = current;
        //     current = Next;
            
        // }
        // return previous;

        //Recursively
        if(head==null || head.next==null) return head; 
        ListNode a = head.next;
        ListNode newHead = reverseList(a);
        a.next=head;
        head.next = null;
        return newHead;
    }
}