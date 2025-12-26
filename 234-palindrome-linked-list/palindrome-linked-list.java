class Solution {
    public ListNode reverseList(ListNode head){
        // if(head == null || head.next == null) return head; //base case 
        // ListNode a = head.next;
        // ListNode nh = reverseList(a);
        // a.next = head;
        // head.next = null;
        // return nh;

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
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode newHead = slow.next;
        slow.next = null;

        ListNode reverseList = reverseList(newHead);

        ListNode temp1 = head;
        ListNode temp2 = reverseList;

        while( temp2 != null )
        {
            if(temp1.val != temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;  
        }
        return true;

        
    }
}