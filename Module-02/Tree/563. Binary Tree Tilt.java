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

    private int helper(TreeNode root, int ans[]) {
        if (root == null) {
            return 0;
        }

        int ls = helper(root.left, ans);
        int rs = helper(root.right, ans);

        ans[0] += Math.abs(ls-rs);
        return ls + rs + root.val;
    }

    // private int helper(TreeNode root) {
    //     if (root == null) {
    //         return 0;
    //     }

    //     int ls = helper(root.left);
    //     int rs = helper(root.right);

    //     sum += Math.abs(ls-rs);
    //     return ls + rs + root.val;
    // }

    public int findTilt(TreeNode root) {
        // sum = 0;
        int ans [] = new int[1];
        helper(root, ans);

        return ans[0];
    }
}
