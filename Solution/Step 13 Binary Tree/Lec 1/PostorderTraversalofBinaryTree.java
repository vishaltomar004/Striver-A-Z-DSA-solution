package Solution.Step 13 Binary Tree.Lec 1;

public class PostorderTraversalofBinaryTree {
    
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        help(root, al);
        return al;
    }

    void help(TreeNode r ,List<Integer> al)
    {
        if(r==null)
        return ;
        help(r.left , al);
        help(r.right,al);
        al.add(r.val);
    }
}