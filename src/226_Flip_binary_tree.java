class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    private void invert(TreeNode node) {
        if (node == null) {
            return;
        }
        swap(node);
        invert(node.left);
        invert(node.right);
    }
    private void swap(TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
