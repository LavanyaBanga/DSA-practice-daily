class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            // expand window
            sum += nums[right];

            // shrink window
            while (sum >= target) {

                int length = right - left + 1;

                ans = Math.min(ans, length);

                sum -= nums[left];
                left++;
            }
        }

        if (ans == Integer.MAX_VALUE) {
            return 0;
        }

        return ans;
    }
}