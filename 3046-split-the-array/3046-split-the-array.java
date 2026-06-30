class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            map.put(num, map.getOrDefault(num,0) + 1);
            if(map.get(nums[i]) > 2) return false;
        }
        return true;
    }
}