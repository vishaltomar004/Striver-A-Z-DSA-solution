package Solution.Step 13 Binary Tree.Lec 1;



class Solution{
    public static void createTree(Node root, ArrayList<Integer> v ){
        // Code here
       
       root.left = new Node(v.get(1));
       root.right = new Node(v.get(2));
       root.left.left = new Node(v.get(3));
       root.left.right = new Node(v.get(4));
       root.right.left = new Node(v.get(5));
       root.right.right = new Node(v.get(6));
    }
}