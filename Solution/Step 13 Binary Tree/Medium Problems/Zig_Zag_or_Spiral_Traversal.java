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
    int mcl =0;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Map<Integer , List<Integer>> ans = new HashMap<>();

        help(root , ans ,0);

List<List<Integer>> n = new ArrayList<>();
for(int i =0 ; i<ans.size() ; i++){

    List<Integer> thisList = ans.get(i);

    if(i %2 != 1){
        n.add(thisList);
    }
    else {
Collections.reverse(thisList);
        n.add(thisList);
    }
}
        return n;
    }

    private void help(TreeNode root , Map<Integer , List<Integer> > map , int cl){

 mcl = Math.max(mcl , cl);
        if(root == null)
        return ;

        if(map.containsKey(cl)){
            List<Integer> list = map.get(cl);
            list.add(root.val);
            map.put(cl , list);
        }
        else {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            map.put(cl , list);
        }

        help(root.left , map , cl+1);
        help(root.right , map , cl+1);
    }
}