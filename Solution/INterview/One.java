import java.util.*;
class S {

    // Arr / list = [ 1,2,3,4,3,2,2,];
    // find all unique triplets , whose sum constituted to 0;
public static void main(String [] args){
    
    int arr[] = { -1, 0 };
    
 int n = arr.length;

 List<List<Integer>> ans = new ArrayList<>();
 Set<List<Integer>> set = new HashSet<>();


 Arrays.sort(arr);
    for(int i =0 ; i< n ; i++){
        for(int j = i+1 ; j<n ; j++){
            for(int k = j+1 ; k<n; k++){
                if(arr[i] + arr[j] + arr[k] ==0){
                    List<Integer> al = new ArrayList<>();
                    al.add(arr[i]);
                    al.add(arr[j]);
                    al.add(arr[k]);

                    if(!set.contains(al)){
                        set.add(al);
                        ans.add(al);
                    }
                }
            }
        }
    }

    if(ans.size() < 1){
        System.out.println("No input");
    }
    for(int i =0 ; i< ans.size() ; i++){
        for(int j =0 ; j<ans.get(i).size() ; j++){
            System.out.print(ans.get(i).get(j) + "  ");
        }
        System.out.println(" ");
    }
}


// * Trapping Rain Water Problem Given n non-negative integers representing an
//  * elevation map where the
//  * width of each bar is 1, compute how much water it can trap after raining.
//  * <p>
//  * 📥 Input input 1 {3, 0, 2, 1, 4}
                         0  0  2  1  
//  * <p>
//  * height: integer array of length n 📤 Output output 1 7 explaination 1 The
//  * elevation map is
//  * represented by the array [3,0,2,0,4]. After raining, 7 units of water are
//  * trapped between the
//  * bars. Visually, it can be represented as:
//  * <p>
//  * // Explanation Diagram of how water is trapped | '=' represents water | = = =
//  * | | = | = |
//  * |_|_|_|_|
//  * <p>
//  * Reasoning: - At index 1, the left max is 3 and right max is 4, so water
//  * trapped = min(3,4) - 0 =
//  * 3 min(3,4) - 0 = 3 - At index 2, the left max is 3 and right max is 4, so
//  * water trapped =
//  * min(3,4) - 2 = 1 - At index 3, the left max is 3 and right max is 4, so water
//  * trapped = min(3,4)
//  * - 0 = 3 - Total water trapped = 3 + 1 + 3 = 7
//  */
    
   //   we need ---> maximum ---> 
   //   
              

}