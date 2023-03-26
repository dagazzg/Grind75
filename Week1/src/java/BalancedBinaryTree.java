package java;

public class BalancedBinaryTree {

    public class TreeNode {
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            return (height(root, 0)) != -1;
        }

        private int height(TreeNode root, int height) {
            if (root == null) return height;
            int leftHeight = height(root.left, height + 1);
            int rightHeight = height(root.right, height + 1);
            if (leftHeight == -1 || rightHeight == -1) return -1;
            if (Math.abs(leftHeight - rightHeight) > 1) return -1;
            return Math.max(leftHeight, rightHeight);
        }

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
