class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxi = Long.MIN_VALUE; 
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    long diff = nums[i] - nums[j]; 
                    long value = diff * nums[k];   
                    maxi = Math.max(maxi, value);  
                }
            }
        }
        
        return maxi > 0 ? maxi : 0; 
    }
}
