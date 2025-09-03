class Solution {
    public void setZeroes(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int firstColumnFlag = -1;

        //First pass to mark rows and columns that need to be zeroed
        for(int i = 0; i < rowCount; i++) {
            for(int j = 0; j < colCount; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark the row
                    if(j != 0) {
                        matrix[0][j] = 0; // Mark the column
                    }
                    else {
                        firstColumnFlag = 0; // Special case for the first column
                    }
                }
            }
        }

        //Second pass to set the elements to zero based on the marks
        for(int i = 1; i < rowCount; i++) {
            for(int j = 1; j < colCount; j++) {
                if(matrix[i][j] != 0 && (matrix[i][0] == 0 || matrix[0][j] == 0)) {
                    matrix[i][j] = 0;
                }
            }
        }

        //Set the first row to zero if needed
        if(matrix[0][0] == 0) {
            for(int j = colCount - 1; j >= 0; j--) {
                matrix[0][j] = 0;
            }
        }

        //Set the first column to zero if needed
        if(firstColumnFlag == 0) {
            for(int i = rowCount - 1; i >= 0; i--) {
                matrix[i][0] = 0;
            }
        }
    }
}