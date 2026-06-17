class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) {
			return nums[0];
		}
		int dp[] = new int[nums.length];
		dp[0]= nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		
		for (int i = 2; i < dp.length; i++) {
			int r = dp[i-2] + nums[i];
			int dnr = dp[i-1];
			dp[i] = Math.max(r, dnr);
		}
		
		return dp[dp.length-1];
    }
}