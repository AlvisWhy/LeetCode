class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) {
            return result;
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
        for (List<Integer> k: res) {
            result.add(k.get(k.size()-1));
        }
        return result;
    }
}
