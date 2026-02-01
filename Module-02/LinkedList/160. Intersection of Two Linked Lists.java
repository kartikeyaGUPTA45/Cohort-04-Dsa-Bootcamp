/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    private int lengthOfLL(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while(temp != null) {
            count+=1;
            temp = temp.next;
        }

        return count;
    }

    private ListNode moveTempNode(ListNode t, int diff) {
        for(int i=1;i<=diff;i++) {
                t = t.next;
        }
        return t;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int l1 = lengthOfLL(headA);
        int l2 = lengthOfLL(headB);

        int diff = Math.abs(l1-l2);

        ListNode t1 = headA;
        ListNode t2 = headB;

        if (l1 > l2) {
            t1 = moveTempNode(t1, diff);
        } else {
            t2 = moveTempNode(t2, diff);
        }

        while(t1 != null) {
            if (t1 == t2) {
                return t1;
            }

            t1 = t1.next;
            t2 = t2.next;
        }

        return null;
    }
}
