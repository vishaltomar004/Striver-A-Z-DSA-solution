package Solution.Step 13 Binary Tree;

public class BinaryTreeTraversalsinBinaryTree {
    /*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.ArrayList;
import java.util.List;

// import jdk.internal.jshell.tool.resources.l10n;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
           List<List<Integer>> al = new ArrayList<>();
           al.add(new ArrayList<>());
           al.add(new ArrayList<>());
           al.add(new ArrayList<>());

           inOrder(al, root);
           preOrder(al, root);
           poOrder(al, root);
           return al;
    }
    public static void inOrder(List<List<Integer>> al , TreeNode r)
    {
          if(r== null)
          return ;
          inOrder(al ,r.left);
          al.get(0).add(r.data);
          inOrder(al , r.right);
    }
     public static void preOrder(List<List<Integer>> al , TreeNode r)
    {
          if(r== null)
          return ;
           al.get(1).add(r.data);
          preOrder(al ,r.left);
         
          preOrder(al , r.right);
    }
     public static void poOrder(List<List<Integer>> al , TreeNode r)
    {
          if(r== null)
          return ;
          poOrder(al ,r.left);
          
          poOrder(al , r.right);
          al.get(2).add(r.data);
    }
}
}
