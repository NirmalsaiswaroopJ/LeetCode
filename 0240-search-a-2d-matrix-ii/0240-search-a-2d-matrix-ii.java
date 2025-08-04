class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean flag = false;
        for(int i = 0; i< rows; i++){
            for(int j = 0; j< cols; j++){
                if(matrix[i][j] == target){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}