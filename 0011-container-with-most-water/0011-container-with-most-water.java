class Solution {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        while(l < r){
            int area = (r-l) * Math.min(height[l], height[r]);
            res = Math.max(res, area);
            if(height[l] < height[r]){
                l = l + 1;
            } else{
                r = r - 1;
            }
        }
        return res;
    }
}