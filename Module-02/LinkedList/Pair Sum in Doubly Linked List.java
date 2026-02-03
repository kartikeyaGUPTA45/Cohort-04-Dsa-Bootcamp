//Problem Link: https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1

//Code: 

/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        if (head == null || head.next == null) {
            return ans;
        }
        
        Node left = head;
        Node right = head;
        
        
        while(right.next != null) {
            right = right.next;
        }
        
        while(left.data < right.data) { 
            int sum = left.data + right.data;
            
            if (sum == target) {
                ArrayList<Integer> subAns = new ArrayList<>();
                subAns.add(left.data);
                subAns.add(right.data);
                ans.add(subAns);
                
                left = left.next;
                right = right.prev;
            } else if (sum > target) {
                right = right.prev;
            } else {
                left = left.next;
            }
        }
        
        return ans;
        
    }
}
