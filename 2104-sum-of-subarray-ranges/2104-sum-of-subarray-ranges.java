class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;

        // Choose the start index of the subarray
        for (int start = 0; start < nums.length; start++) {
            int min = nums[start];
            int max = nums[start];

            // Expand the subarray to the right
            for (int end = start; end < nums.length; end++) {
                min = Math.min(min, nums[end]);
                max = Math.max(max, nums[end]);

                // Add the range of the current subarray
                sum += max - min;
            }
        }

        return sum;
    }
}