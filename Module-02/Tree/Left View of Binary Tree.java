// Problem Link: https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1

//Code: 
class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(q.size() > 0) {
            int sz = q.size();
            
            for(int i=1;i<=sz;i++) {
                Node node = q.poll();
                
                if (i == 1) {
                    ans.add(node.data);
                }
                
                if (node.left != null) {
                    q.add(node.left);
                }
                
                if (node.right != null) {
                    q.add(node.right);
                }
             }
        }
        
        return ans;
        
    }
}
