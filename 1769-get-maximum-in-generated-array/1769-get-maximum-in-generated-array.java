class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        for(int i = 1; i <= n/2; i++){
            res[2 * i] = res[i];
            if (2 * i + 1 <= n) {
                res[2 * i + 1] = res[i] + res[i + 1];
            }
        }
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n+1; i++){
            if(res[i] > maxi){
                maxi = res[i];
            }
        }
        return maxi;

    }
}