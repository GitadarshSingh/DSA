
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i=1 ; i<=n ;i++){
            fast = fast.next;
        }
        if(fast == null){// n == len
        // I have delete the head
        return head.next;
            
        }
        // Moves slow and fast simultaneously untill fast reached at tail
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //deletion of node 
        slow.next = slow.next.next;
        return head;
    }
}