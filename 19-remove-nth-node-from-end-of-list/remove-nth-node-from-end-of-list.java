
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = 0;

        while(temp != null){
           temp = temp.next;
           len++;
        }
        //Imp
        if(n== len) return head.next;
        // nth from end = (len-n+1) from start 
        // we need a temp = len-n;
        temp = head;
        for(int i = 1 ;i<=len-n-1 ;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}