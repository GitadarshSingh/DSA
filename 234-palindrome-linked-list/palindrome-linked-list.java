class Solution {
    public ListNode reverseList(ListNode head){
        ListNode current = head;
        ListNode previous = null;
         ListNode Next = head;

        while(current != null)
        {
            Next = current.next;
            current.next = previous;
            previous = current;
            current = Next;
            
        }
        return previous;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode newHead = new ListNode(head.val);
        ListNode temp1 = head;
        ListNode temp2 = newHead;
        while(temp1 != null)
        {
            ListNode temp = new ListNode(temp1.val);
            temp2.next = temp; 
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        newHead = reverseList(newHead);
        
        temp1 = head;
        temp2 = newHead;

        while(temp1 != null)
        {
            if(temp1.val != temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;

        
    }
}