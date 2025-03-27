class Solution {
    public int minOperations(int[][] grid, int x) {
        int mini=0;
        int m=grid.length;
        int n=grid[0].length;
        int l=m*n;
        int[] newarr=new int[l];
        int k=0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (grid[i][j]%x!=grid[0][0]%x){
                    return -1;
                }
                newarr[k++]=grid[i][j];
            }
        }
        Arrays.sort(newarr);
        int mid=l/2;
        for (int num:newarr){
            mini+=Math.abs(num-newarr[mid])/x;
        }
        return mini;
    }
}