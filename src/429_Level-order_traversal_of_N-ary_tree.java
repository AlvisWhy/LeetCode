class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            return res;
        }
        Queue<Node> queue =  new ArrayDeque<Node>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            List<Integer> temp = new ArrayList<Integer>();
            int len = queue.size();
            while(len > 0) {
                Node tempNode = queue.poll();
                temp.add(tempNode.val);
                if(!tempNode.children.isEmpty()) {
                    for(Node k: tempNode.children) {
                        queue.offer(k);
                    }
                }
                len --;
            } 
            res.add(temp);
        }
        return res;
    }
}
