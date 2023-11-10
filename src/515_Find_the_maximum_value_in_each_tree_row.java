class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> queue =  new ArrayDeque<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int max = queue.peek().val;
            int len = queue.size();
            while(len > 0) {
                TreeNode tempNode = queue.poll();
                if (max < tempNode.val) {
                    max = tempNode.val;
                }
                if (tempNode.left != null) {
                    queue.offer(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.offer(tempNode.right);
                }
                len --;
            } 
            res.add(max);
        }
        return res;
    }
    
}
