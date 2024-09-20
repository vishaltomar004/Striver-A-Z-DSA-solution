package Solution.Step 13 Binary Tree.Lec 1;

public class Level order TraversaLevelordertraversalinspiralform {
    
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        

        Map<Integer, List<Integer>> map = new HashMap<>();
               
               lT(root , 0 , map);

               List<List<Integer>>  bl= new ArrayList<>();
               for(int i =0; i<map.size() ; i++)
               {
                bl.add(map.get(i));
               }
return bl;

    }
    private void lT(TreeNode root , int cl , Map<Integer,List<Integer>> map)
    {
        if(root == null)
        return ;

        if(map.containsKey(cl))
        {
               List<Integer> a = map.get(cl);
               a.add(root.val);
            map.put(cl ,a );
        }
        else 
        {
            map.put(cl , new ArrayList<>());
            List<Integer> a = new ArrayList<>();
            a.add(root.val);
            map.put(cl ,a);
        }

        lT(root.left , cl+1 , map);
        lT(root.right , cl+1 , map);
        
    }
}
