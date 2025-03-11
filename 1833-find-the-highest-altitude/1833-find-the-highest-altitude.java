class Solution {
    public int largestAltitude(int[] gain) {
        int[] res = new int[gain.length + 1];
        res[0] = 0;
        for(int i = 1; i < res.length; i++){
            res[i] = gain[i-1] + res[i-1];
        }
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < res.length; i++){
            if(res[i] > maxi){
                maxi = res[i];
            }
        }
        return maxi;
    }
}