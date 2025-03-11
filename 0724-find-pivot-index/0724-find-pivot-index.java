class Solution {
    public int pivotIndex(int[] nums) {
        int ind = -1;
        for(int i = 0; i < nums.length; i++){
            int left_sum = 0;
            int right_sum = 0;
            for(int j = 0; j < i; j++){
                left_sum = left_sum + nums[j];
            }
            for(int k = i+1; k<nums.length; k++){
                right_sum = right_sum + nums[k];
            }
            if(left_sum == right_sum){
                ind = i;
                break;
            }
        }
        return ind;
    }
}