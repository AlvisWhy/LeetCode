class Solution {
    public Node connect(Node root) {
        if(root == null) {
            return root;
        }
        Queue<Node> queue =  new ArrayDeque<Node>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();
            while(len > 0) {
                Node tempNode = queue.poll();
                if (len>1) {
                    tempNode.next = queue.peek();
                }
                else {
                    tempNode.next = null;
                }
                if (tempNode.left != null) {
                    queue.offer(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.offer(tempNode.right);
                }
                len --;
            }
        }
        return root;
    }
}
