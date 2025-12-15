class Solution
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
       ListNode slow = head;
       ListNode fast = head;

       //move fast 'n' step away 
       for(int i=1;i<=n; i++)
       {
        fast = fast.next;
       } 

       if(fast == null) return head.next; //n==len, ihave to delete head

       //move slow and fast together until fast reach tail
       while(fast.next != null)
       {
        slow = slow.next;
        fast = fast.next;
       }
       slow.next = slow.next.next;

       return head;

        
    }
}
