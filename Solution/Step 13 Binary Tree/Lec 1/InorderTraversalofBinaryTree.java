package Solution.Step 13 Binary Tree.Lec 1;

public class InorderTraversalofBinaryTree {
    
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> al = new ArrayList<>();
        preOrder(al , root);
        return al;
    }
       public static void preOrder(List<Integer> al , TreeNode r)
    {
          if(r== null)
          return ;
          
          preOrder(al ,r.left);
          al.add(r.val);
          preOrder(al , r.right);
    }
}