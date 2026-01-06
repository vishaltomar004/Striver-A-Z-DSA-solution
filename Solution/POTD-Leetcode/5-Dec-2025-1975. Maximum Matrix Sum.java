class Solution {
    public long maxMatrixSum(int[][] matrix) {
        
        int smallest = Integer.MAX_VALUE;
        int row = matrix.length;
        int col = matrix[0].length;
         int negCount =0;
         int zeroC=0;
         long sum =0;
        for(int i =0; i<row ;i++){

            for(int j =0; j<col; j++){
                if(matrix[i][j] == 0){
                    zeroC++;
                }
                if(matrix[i][j] <0){
                    negCount++;
                }

                if(matrix[i][j] !=0){
                    smallest = Math.min(smallest , Math.abs(matrix[i][j]));
                }

                sum += Math.abs(matrix[i][j]);
            }
        }
System.out.println("SUM " + sum );
System.out.println("negCount : "+ negCount);
System.out.println("zeroC : "+ zeroC + " smallest : " + smallest ) ;
        if(zeroC !=0){
            return sum;
        }

        if(negCount %2 ==1){
            return sum - (smallest*2);
        }

        return sum;
    }
}