class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = Math.max(ans, helper(nums, i));
        }    
        return ans;
    }

    int helper(int[] nums, int i) {
        if (dp[i] != -1) return dp[i];
        
        int curr = nums[i];
        int maxFutureLoot = 0;
    
        for (int j = i + 2; j < nums.length; j++) {
            maxFutureLoot = Math.max(maxFutureLoot, helper(nums, j));
        }
        
        return dp[i] = curr + maxFutureLoot; 
    }
}