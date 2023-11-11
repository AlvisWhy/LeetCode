class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue =  new ArrayDeque<TreeNode>();
        queue.offer(root);
        int maxLayer = 0;
        while(!queue.isEmpty()) {
            maxLayer += 1;
            List<Integer> temp = new ArrayList<Integer>();
            int len = queue.size();
            while(len > 0) {
                TreeNode tempNode = queue.poll();
                temp.add(tempNode.val);
                if (tempNode.left != null) {
                    queue.offer(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.offer(tempNode.right);
                }
                len --;
            } 
        }
        return maxLayer;
    }

    // recursion
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
    }
}
