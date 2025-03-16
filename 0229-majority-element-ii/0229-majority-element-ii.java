class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i: nums){
            temp.put(i, temp.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            if(entry.getValue() > n){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}