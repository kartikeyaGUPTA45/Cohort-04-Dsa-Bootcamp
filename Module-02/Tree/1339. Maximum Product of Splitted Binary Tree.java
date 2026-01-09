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
    long ans;

    private long sumOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        long ls = sumOfTree(root.left);
        long rs = sumOfTree(root.right);

        return ls + rs + root.val;
    }

    private long helper(TreeNode root, long sum) {
        if (root == null) {
            return 0;
        }

        long ls = helper(root.left, sum);
        long rs = helper(root.right, sum);
        long currSum = ls + rs + root.val;
        long remainingSum = sum - currSum;
        long prodOfSum = currSum * remainingSum;
        ans = Math.max(ans, prodOfSum);

        return currSum;
    }

    public int maxProduct(TreeNode root) {
        long sum = sumOfTree(root);
        ans = Long.MIN_VALUE;
        helper(root, sum);

        int mod = 1000000007;

        return (int)(ans%mod);
    }
}
