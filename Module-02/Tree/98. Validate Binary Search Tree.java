/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private boolean helper(TreeNode root, TreeNode minNode, TreeNode maxNode) {
        if (root == null) {
            return true;
        } 

        if ((minNode != null && minNode.val >= root.val) || (maxNode != null && maxNode.val <= root.val)) {
            return false;
        }

        boolean lchild = helper(root.left, minNode, root);
        boolean rchild = helper(root.right, root, maxNode);

        return lchild && rchild;
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
}
