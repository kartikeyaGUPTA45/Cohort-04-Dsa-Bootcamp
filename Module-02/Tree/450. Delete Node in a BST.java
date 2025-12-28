class Solution {

    private int findMax(TreeNode root) {
        if (root.right == null) {
            return root.val;
        }

        return findMax(root.right);
    }

    private int findMin(TreeNode root) {
        if (root.left == null) {
            return root.val;
        }

        return findMin(root.left);
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
                return root.right;
            } else {
                // int maxNodeVal = findMax(root.left);
                // root.val = maxNodeVal;
                // root.left = deleteNode(root.left, maxNodeVal);
                int minNodeVal = findMin(root.right);
                root.val = minNodeVal;
                root.right = deleteNode(root.right, minNodeVal);
            }
        }

        return root;
    }
}
