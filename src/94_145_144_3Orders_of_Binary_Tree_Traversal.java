//in order
import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    public void inorder ( TreeNode t ,List<Integer> list) {
        if (t == null) {
            return;
        }
        inorder(t.left, list);
        list.add(t.val);
        inorder(t.right, list);
    }
}
//Post order
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }
    public void postorder ( TreeNode t ,List<Integer> list) {
        if (t == null) {
            return;
        }
        postorder(t.left, list);
        postorder(t.right, list);
        list.add(t.val);
    }
}
//PreOrder
 import java.util.List;
 import java.util.ArrayList;
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }
    public void preorder ( TreeNode t ,List<Integer> list) {
        if (t == null) {
            return;
        }
        list.add(t.val);
        preorder(t.left, list);
        preorder(t.right, list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
         Stack<>
    }
}
