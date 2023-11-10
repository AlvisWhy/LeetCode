class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> queue =  new ArrayDeque<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()) {
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
            res.add(temp);
        }
        Collections.reverse(res);
        return res;
    }
}
