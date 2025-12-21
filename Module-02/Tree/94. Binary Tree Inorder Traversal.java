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

    private void inOrderTraversal(TreeNode root, List<Integer> ans) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left, ans);
        ans.add(root.val);
        inOrderTraversal(root.right, ans);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inOrderTraversal(root, ans);

        return ans;
    }
}
