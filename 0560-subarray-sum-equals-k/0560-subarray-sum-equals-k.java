class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        int res = 0;
        int count = 0;
        temp.put(0, 1);
        for(int i = 0; i<nums.length; i++){
            res = res + nums[i];
            if(temp.containsKey(res - k)){
                count += temp.get(res-k);
            }
            temp.put(res, temp.getOrDefault(res, 0)+1);

        }
        return count;
    }
}