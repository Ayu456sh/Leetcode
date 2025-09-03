class Solution {
    public void setZeroes(int[][] matrix) {
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    markRow(matrix,i);
                    markCol(matrix,j);
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==-10){
                    matrix[i][j]=0;
                }
            }
        }
    }
    private void markRow(int[][] matrix , int i){
        for(int j=0; j<matrix[i].length; j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-10;
            }
        }
    }
    private void markCol(int[][]matrix, int j){
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-10;
            }
        }
    }
}