class Solution {
    public void setZeroes(int[][] matrix) {
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        List<Integer> row_pos = new ArrayList<>();
        List<Integer> col_pos = new ArrayList<>();
        for(int i = 0; i < row_len; i++){
            for(int j = 0; j< col_len; j++){
                if(matrix[i][j] == 0){
                    row_pos.add(i);
                }
            }
        }
        for(int i = 0; i< row_len; i++){
            for(int j = 0; j < col_len; j++){
                if(matrix[i][j] == 0){
                    col_pos.add(j);
                }
            }
        }
        for(int i = 0; i< row_len; i++){
            for(int j = 0; j < col_len; j++){
                if(row_pos.contains(i)){
                    matrix[i][j] = 0;
                }
                if(col_pos.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}