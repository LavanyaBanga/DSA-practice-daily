class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int target=1;
        for(int i:nums){
            if(i==target) target++;
            else if(i>target) return target;
        }
        return target;
    }
}