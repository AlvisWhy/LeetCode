class Solution {

    long formerValue = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        
        if (root == null) {
            return true;
        }
        
        boolean right = true;
        boolean left = true;
        left = isValidBST(root.left);
        if (root.val > formerValue) {
            formerValue = root.val;
        }
        else {
            return false;
        }
        right = isValidBST(root.right);
        return right && left;
    }
}
