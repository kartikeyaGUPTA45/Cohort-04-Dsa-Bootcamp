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
    public int maxLevelSum(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxSum = Integer.MIN_VALUE;
        int ans = -1;

        int level = 1;

        while(q.size() > 0) {
            int sz = q.size();
            int sum = 0;
            for(int i=1;i<=sz;i++) {
                TreeNode node = q.remove();
                sum += node.val;

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }
            }

            if (sum > maxSum) {
                maxSum = sum;
                ans = level;
            }

            level += 1;
        }

        return ans;
    }
}
