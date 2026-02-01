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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int carry = 0;

        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummyNode = new ListNode(-1);
        ListNode t = dummyNode;

        while(t1 != null || t2 != null) {
            int sum = carry;

            sum+= ((t1 != null) ? t1.val : 0);
            sum+= ((t2 != null) ? t2.val : 0);

            ListNode node = new ListNode(sum%10);
            t.next = node;
            t = t.next;

            carry = sum/10;

            if (t1 != null) t1 = t1.next;
            if (t2 != null) t2 = t2.next;
        }

        if (carry != 0) {
            ListNode node = new ListNode(carry);
            t.next = node;
        }

        return dummyNode.next;
    }
}
