class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);
        ListNode tempA = a;
         ListNode tempB = b;
        ListNode temp = head;

        int index = 1;
        while(temp != null)
        {
            if((index & 1) == 1){
                tempA.next = temp;
                tempA = tempA.next;    
            }
            else{
                tempB.next = temp;
                tempB = tempB.next;
            }
            temp = temp.next;
            index++;
        }
        tempA.next = null;
        tempB.next = null;


        //Merge Two Sorted Linked List. 2 Lists are 
        // a.next and b.next
        ListNode dummy = new ListNode(-2);
        ListNode td = dummy;
        ListNode tempD = a.next;
        ListNode tempE = b.next;

        while(tempD != null || tempE != null)
        {
            if(tempE != null ){
                td.next = tempE;
                td = td.next;
                tempE = tempE.next;
            }
            if(tempD != null ) {
                td.next = tempD;
                td = td.next;
                tempD = tempD.next;
            }
            
        }
       td.next = null;
return dummy.next;

         
    }
}