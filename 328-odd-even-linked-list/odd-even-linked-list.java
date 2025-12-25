class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);
        ListNode tempA = a;
        ListNode tempB = b;
        ListNode temp = head;

        int index = 1;

        while (temp != null) {
            if ((index & 1) == 1) {
                tempA.next = temp;
                tempA = tempA.next;
            } else {
                tempB.next = temp;
                tempB = tempB.next;
            }
            temp = temp.next;
            index++;
        }

        tempB.next = null;     
        tempA.next = b.next;   

        return a.next;
    }
}
