//Problem Link: https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1

//Code: 

/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        int count = 0;
        
        if (head == null) {
            return count;
        }
        
        Node temp = head;
        
        while(temp != null) {
            count+=1;
            temp = temp.next;
        }
        
        return count;
        
    }
}
