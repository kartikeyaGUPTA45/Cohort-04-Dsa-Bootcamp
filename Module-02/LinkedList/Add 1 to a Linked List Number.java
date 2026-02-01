//Problem Link: https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1

//Code:

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    
    private int add(Node head) {
        if (head == null) {
            return 1;
        }
        
        int carry = add(head.next);
        int newData = head.data + carry;
        head.data = newData%10;
        
        return newData/10;
    }
    
    public Node addOne(Node head) {
        // code here.
        int carry = add(head);
        
        if (carry != 0) {
            Node node = new Node(carry);
            node.next = head;
            head = node;
        }
        
        return head;
    }
}
