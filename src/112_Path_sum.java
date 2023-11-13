class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return hasPathHelper(root, targetSum, 0);
    }
    public boolean hasPathHelper(TreeNode root, int targetSum, int currentSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (targetSum == currentSum+root.val) {
                return true;
            }
        }

        boolean resL = false;
        boolean resR = false;
        if (root.left != null) {
            resL = hasPathHelper(root.left, targetSum, currentSum + root.val);
        }
        if (root.right != null) {
            resR = hasPathHelper(root.right, targetSum, currentSum + root.val);
        }

        return resL|| resR;

    } 
    
