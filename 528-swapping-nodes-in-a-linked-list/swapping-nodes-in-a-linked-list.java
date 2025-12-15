class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;

        // move first to k-th node
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // move temp to end, second follows
        temp = first;
        while (temp.next != null) {
            temp = temp.next;
            second = second.next;
        }

        // swap values
        int t = first.val;
        first.val = second.val;
        second.val = t;

        return head;
    }
}
