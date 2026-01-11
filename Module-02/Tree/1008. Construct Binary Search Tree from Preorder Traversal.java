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
    private int idx;

    private TreeNode helper(int [] preorder, int minVal, int maxVal) {

        if (idx >= preorder.length) {
            return null;
        }

        int val = preorder[idx];
        if (val < minVal || val > maxVal) {
            return null;
        }

        TreeNode node = new TreeNode(val);
        idx+=1;
        node.left = helper(preorder, minVal, val-1);
        node.right = helper(preorder, val+1, maxVal);

        return node;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        idx = 0;
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
