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

    private TreeNode constructBT(int pre[], int psi, int pei, int in[], int isi, int iei) {
        if (isi > iei) {
            return null;
        }

        TreeNode node = new TreeNode(pre[psi]);
        int idx = isi;

        while(in[idx] != pre[psi]) {
            idx+=1;
        }

        int nodes = idx-isi;

        node.left = constructBT(pre,psi+1, psi+nodes, in, isi, idx-1);
        node.right = constructBT(pre, psi+nodes+1, pei, in, idx+1, iei);

        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;

        return constructBT(preorder, 0,n-1, inorder,0,n-1);
    }
}
