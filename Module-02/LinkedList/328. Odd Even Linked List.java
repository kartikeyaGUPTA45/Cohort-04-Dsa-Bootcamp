/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dO = new ListNode(-1);
        ListNode dE = new ListNode(-2);

        ListNode t1 = dO;
        ListNode t2 = dE;
        ListNode t = head;

        int idx = 1;

        while(t != null) {
            if (idx%2 != 0) {
                t1.next = t;
                t1 = t1.next;
            } else {
                t2.next = t;
                t2 = t2.next;
            }

            t = t.next;
            idx+=1;
        }

        t1.next = dE.next;
        t2.next = null;

        return dO.next;
    }
}
