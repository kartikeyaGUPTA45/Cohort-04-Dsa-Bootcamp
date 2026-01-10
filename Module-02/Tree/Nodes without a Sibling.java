//Problem Link: https://www.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1

//Code: 


class Tree {
    
    private void helper(Node root, ArrayList<Integer>ans) {
        if (root == null) {
            return;
        }
        
        if (root.left != null && root.right == null) {
            ans.add(root.left.data);
        }
        
        if (root.left == null && root.right != null) {
            ans.add(root.right.data);
        }
        
        helper(root.left, ans);
        helper(root.right, ans);
    }
    
    ArrayList<Integer> noSibling(Node node) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        helper(node, ans);
        
        if (ans.size() == 0) {
            ans.add(-1);
        }
        
        Collections.sort(ans);
        return ans;
    }
}
