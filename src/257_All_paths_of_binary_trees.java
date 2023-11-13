class Solution {

    List<String> res = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return res;
    }
    private void helper(TreeNode n, StringBuilder sb) {
        if (n == null) {
            return;
        }
        if (n.left == null && n.right == null) {
            sb.append(n.val);
            res.add(sb.toString());
            return;
        }
        StringBuilder temp1 = new StringBuilder(sb);
        StringBuilder temp2 = new StringBuilder(sb);
        temp1.append(n.val);
        temp1.append("->");
        temp2.append(n.val);
        temp2.append("->");
        helper(n.left, temp1);
        helper(n.right, temp2);
    }
}
