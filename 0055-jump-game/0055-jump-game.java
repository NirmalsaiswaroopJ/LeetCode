class Solution {
    public boolean canJump(int[] nums) {
        int maxvalue = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxvalue) return false;
            int sum = i + nums[i];
            maxvalue = Math.max(maxvalue, sum);
        }
        return maxvalue >= nums.length - 1;
    }
}