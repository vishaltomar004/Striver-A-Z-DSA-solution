package Solution.Step 13 Binary Tree.Lec 3;

public class Maximum_Width_Of_Binary_Tree {

    class Pair {
    int index;
    TreeNode node;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int ans = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            int min = q.peek().index;  // leftmost index in this level
            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                int currIndex = p.index - min; // normalize index to avoid overflow

                if (i == 0) first = currIndex;
                if (i == size - 1) last = currIndex;

                if (p.node.left != null) {
                    q.add(new Pair(p.node.left, 2 * currIndex + 1));
                }
                if (p.node.right != null) {
                    q.add(new Pair(p.node.right, 2 * currIndex + 2));
                }
            }
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }
}

    
}
