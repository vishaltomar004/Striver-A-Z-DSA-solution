

class Solution {
    public int minChanges(String s) {
        
 int n =s.length();
int change =0;
 for(int i =0; i<n-1; i=i+2)
 {
    if(s.charAt(i) !=s.charAt(i+1))
    {
        change++;
    }
 }
 return change;
    }
}