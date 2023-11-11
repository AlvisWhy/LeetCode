class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> queue =  new ArrayDeque<TreeNode>();
        queue.offer(root);
        int layer = 0;
        while(!queue.isEmpty()) {
            layer += 1;
            List<Integer> temp = new ArrayList<Integer>();
            int len = queue.size();
            while(len > 0) {
                TreeNode tempNode = queue.poll();
                if (tempNode.left == null && tempNode.right == null) {
                    return layer;
                }
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
        return 0;
    }

    // recursion
        public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if (root.right==null && root.left == null) {
            return 1;
        }
        else if (root.right == null) {
            return 1 + minDepth(root.left);
        }
        else if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        else {
            return 1 + Math.min(minDepth(root.right), minDepth(root.left));
        }
    }
}
