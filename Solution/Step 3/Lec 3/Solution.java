package Solution.Step 3.Lec 3;

public class Solution {
      public int maxProduct(int[] a) {
        
        int n =a.length;

        int pre =1;
        int suf =1;
     int ans =Integer.MIN_VALUE;
        for(int i =0; i<n; i++){

            if(pre==0){
                pre =1;
            }
            pre = pre * a[i];

            if(suf ==0){
                suf =1;
            }
            suf = suf * a[n-i-1];

            ans = Math.max(ans , Math.max(pre, suf));
        }

        return ans;
    }
}
