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

    private void pathSum(TreeNode root, int targetSum, List<Integer> subAns, List<List<Integer>>ans) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                List<Integer> temp = new ArrayList<>(subAns); // 
                temp.add(root.val);
                ans.add(temp);
                return;
            }
        }

        subAns.add(root.val); // 

        pathSum(root.left, targetSum - root.val, subAns, ans);
        pathSum(root.right, targetSum - root.val, subAns, ans);
        
        subAns.remove(subAns.size()-1);  //
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subAns = new ArrayList<>();
        pathSum(root, targetSum, subAns, ans);
        return ans;
    }
}
