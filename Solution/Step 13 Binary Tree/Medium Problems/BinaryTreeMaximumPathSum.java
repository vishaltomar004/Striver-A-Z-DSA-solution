
class Solution {
    int maxi =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        

        int x = help(root);
        return maxi;
       
    }

    int help(TreeNode root){
         if(root == null){
            return 0;
        }

        int left = help(root.left);
        int right = help(root.right);

        maxi = Math.max(maxi , root.val + left + right);
        maxi = Math.max(maxi , root.val);
        maxi = Math.max(maxi , root.val + left); 
        maxi = Math.max(maxi , right + root.val);

        return Math.max(left + root.val, Math.max(root.val , right + root.val )  ) ;
    }
}