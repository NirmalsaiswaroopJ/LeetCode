class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missing = -1;
        Arrays.sort(nums);
        int[] temp = new int[n+1];
        for(int i = 0; i <= n; i++){
            temp[i] = i;
        }
        for(int i = 0; i < n; i++){
            if(nums[i] == temp[i]){
                continue;
            }else{
                missing = temp[i];
                break;
            }
        }
        if(missing == -1){
            return n;
        } else{
            return missing;
        }
    }
}