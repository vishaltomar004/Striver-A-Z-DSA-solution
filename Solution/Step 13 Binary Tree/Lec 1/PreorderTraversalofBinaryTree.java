package Solution.Step 13 Binary Tree.Lec 1;

public class PreorderTraversalofBinaryTree {
    
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        preOrder(al , root);
        return al;
    }
       public static void preOrder(List<Integer> al , TreeNode r)
    {
          if(r== null)
          return ;
           al.add(r.val);
          preOrder(al ,r.left);
         
          preOrder(al , r.right);
    }
}