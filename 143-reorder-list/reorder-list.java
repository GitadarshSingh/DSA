class Solution {
    public ListNode reverseList(ListNode head){
        if(head==null || head.next ==null) return head;
        ListNode a = head.next;
        ListNode newHead = reverseList(a);
        a.next=head;
        head.next = null;
        return newHead;
    }
    public void reorderList(ListNode head) {
        //Middle Of Linked List
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        //reverse LL
        head2 = reverseList(head2);

        //Joinig 2 LL
        ListNode dummy = new ListNode(-1);
        ListNode temp  = dummy;
        

        while(head!=null && head2!=null){
            temp.next = head;
            head = head.next;
            temp=temp.next;
            
            temp.next = head2;
            head2=head2.next ;
            temp=temp.next;

        }
        if(head==null) temp.next = head2;
        else temp.next = head;
        head = dummy.next;
    }
}