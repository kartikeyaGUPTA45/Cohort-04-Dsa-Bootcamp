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

    private TreeNode helper(int nums[], int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end)/2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = helper(nums, start, mid-1);
        node.right = helper(nums, mid+1, end);

        return node;

    }


    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        return helper(nums, 0, nums.length-1);
    }
}
