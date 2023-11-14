class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode n = constructHelper(nums, 0, nums.length);
        return n;
    }

    public TreeNode constructHelper(int[] n, int startIndex, int endIndex) {
        TreeNode left;
        TreeNode right;
        if (startIndex == endIndex) {
            return null;
        }
        int maxIndex = findMaxIndex(n, startIndex, endIndex);

        left = constructHelper(n, startIndex, maxIndex);
        right = constructHelper(n,  maxIndex+1, endIndex);

        TreeNode node = new TreeNode(n[maxIndex], left, right);
        return node;
    }

    public int findMaxIndex(int[] n, int start, int end) {
        int max = n[start];
        int maxIndex = start;
        for (int i=start; i< end; i++) {
            if (n[i] > max) {
                max = n[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    } 
