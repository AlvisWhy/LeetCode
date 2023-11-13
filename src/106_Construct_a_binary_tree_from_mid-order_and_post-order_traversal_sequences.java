class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }
        return buildTreeHelper(inorder, postorder, 0, inorder.length, 0, postorder.length);
    }

    private TreeNode buildTreeHelper(int[] inorder, int[] postorder, int inorderStart, int inorderEnd, int postorderStart, int postorderEnd) {

        if (postorderStart == postorderEnd) {
            return null;
        }

        int rootVal = postorder[postorderEnd -1];
        TreeNode root = new TreeNode(rootVal);

        int midIndex;
        for (midIndex=inorderStart; midIndex< inorderEnd; midIndex++) {
            if (rootVal == inorder[midIndex]) {
                break;
            }
        }

        int leftInStart = inorderStart;
        int leftInEnd = midIndex;
        int rightInStart = midIndex+1;
        int rightInEnd = inorderEnd;
        
        int leftPostStart = postorderStart;
        int leftPostEnd = postorderStart + (midIndex - inorderStart);
        int rightPostStart = leftPostEnd;
        int rightPostEnd = postorderEnd - 1;

        root.left = buildTreeHelper(inorder, postorder, leftInStart, leftInEnd, leftPostStart, leftPostEnd);
        root.right = buildTreeHelper(inorder, postorder, rightInStart, rightInEnd, rightPostStart, rightPostEnd);

        return root;
    }

}
