class Solution {

    int finalValue = 0;
    int currentMaxDepth = 0;

    public int findBottomLeftValue(TreeNode root) {
        findHelper(0, root);
        return finalValue;
    }

    public void findHelper(int depth, TreeNode node) {

        if (node == null) {
            return;
        }

        depth += 1;
        if (node.left == null && node.right == null) {
            if (depth > currentMaxDepth) {
                currentMaxDepth = depth;
                finalValue = node.val;
            } 
        }

        if (node.left != null) {
        findHelper(depth, node.left);
        }

        if (node.right != null) {
        findHelper(depth, node.right);
        }
    }

}
