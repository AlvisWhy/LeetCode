class Solution {
    public boolean isBalanced(TreeNode root) {
        if (getHeight(root) == -1) {
            return false;
        }
        else {
            return true;
        }
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        if (rightHeight == -1 || leftHeight == -1) {
            return -1;
        }

        int res = 1 + Math.max(leftHeight, rightHeight);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            res = -1;
        }
        return res;
    }
}
