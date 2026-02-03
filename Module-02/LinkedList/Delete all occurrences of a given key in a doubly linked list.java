//Problem Link: https://www.geeksforgeeks.org/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list/1

//Code: 

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // code here
        if (head == null) {
            return null;
        }
        
        Node dN = new Node();
        dN.data = -100;
        
        Node temp = dN;
        Node curr = head;
        
        while(curr != null) {
            if (curr.data == x) {
                curr = curr.next;
                continue;
            }
            
            temp.next = curr;
            curr.prev = temp;
            
            temp = curr;
            curr = curr.next;
        }
        
        temp.next = null;
        
        return dN.next;
        
        
    }
}
