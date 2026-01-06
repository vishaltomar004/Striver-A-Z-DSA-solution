package Solution.Step-15.Graph [Concepts and Problems ];

public class Bipertite {
    
}
class Solution {
    public boolean isBipartite(int[][] graph) {
           int lar = Integer.MIN_VALUE;
          ArrayList<ArrayList<Integer>> list = new ArrayList<>();
         for(int i =0 ; i<graph.length ; i++){
            ArrayList<Integer> al = new ArrayList<>();
            for(int j =0 ;j<graph[i].length ; j++){
                   al.add(graph[i][j]);
                   lar = Math.max(lar , graph[i][j]);
            }

            list.add(al);
         }

        Queue<Integer> q = new LinkedList<>();
        int color[] = new int [graph.length];
        Arrays.fill(color , -1);
        q.add(0);

        color[0] = 1;
  boolean ans = true;
       for(int i =0 ; i< color.length ; i++){
        ans = ans && solve(q ,color , list);
       }
       
        return ans;
    }

    boolean solve(Queue<Integer> q  , int color[] , ArrayList<ArrayList<Integer>> list ){

         while(!q.isEmpty()){
            int currentNode = q.remove();
            int CurrentColor = color[currentNode];
 
            for(int i =0 ; i<list.get(currentNode).size() ; i++){
                  int thisNode = list.get(currentNode).get(i);

                  if(color[thisNode] == CurrentColor){
                    return false;
                  }

                if(color[thisNode] == -1){
                    q.add(thisNode);
                    color[thisNode] = CurrentColor == 0 ? 1 : 0;
                }


            }
        }

        return true;
    }
}
