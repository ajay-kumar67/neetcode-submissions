class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length; // number of columns 


        boolean[] rows = new boolean[m];// row wide 
        boolean[] cols = new boolean[n]; // col wide 

        // Pass 1: Mark which rows & cols -> zeros 

        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        /*
        if (i,j) say (1,1) -> 0 then entire 1st row & 1st col should be equal to  0 
        */
        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                if(rows[i] || cols[j]){
                    matrix[i][j] = 0; // assign 0 for entire row or column accordingly
                }
            }
        }

        
    }
}
