class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        int[] res = new int[nums.length];
        int counter = 0;
        for(int i: nums){
            if(i == 0){
                res[counter] = 0;
                counter++;
            }
        }
        for(int i: nums){
            if(i == 1){
                res[counter] = 1;
                counter++;
            }
        }
        for(int i: nums){
            if(i == 2){
                res[counter] = 2;
                counter++;
            }
        }
        for(int i = 0; i< nums.length; i++){
            nums[i] = res[i];
        }

    }
}