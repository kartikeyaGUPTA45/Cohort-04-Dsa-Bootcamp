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
    private int sum = 0;

    private void helper(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }

        if (root.val < low) {
            helper(root.right, low, high);
        } else if (root.val > high) {
            helper(root.left, low, high);
        } else {
            sum += root.val;
            helper(root.left, low, high);
            helper(root.right, low, high);
        }
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        sum = 0;
        helper(root, low, high);

        return sum;
    }
}
