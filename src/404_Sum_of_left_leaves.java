lass Solution {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        sumHelper(root); 
        return sum;
    }

    private boolean isLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            return true;
        }
        return false;
    }

    private void sumHelper(TreeNode node) {
        if (node == null) {
            return;
        }
        if(isLeaf(node)){
            return;
        }
        if (node.left != null && isLeaf(node.left)) {
            sum += node.left.val;
        }
        if (node.right != null && !isLeaf(node.right)) {
            sumHelper(node.right);
        }
        if (node.left != null && !isLeaf(node.left)) {
            sumHelper(node.left);
        }
    }

}
