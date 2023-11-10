class Solution {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }
    private boolean compare(TreeNode left, TreeNode right) {
        if ((left != null && right ==null) || (left == null && right !=null)) {
            return false;
        }
        else if (left==null && right ==null) {
            return true;
        }
        else if (left.val != right.val) {
            return false;
        }
        if (compare(left.left, right.right) && compare(left.right, right.left)) {
            return true;
        }
        return false;
    }
}
