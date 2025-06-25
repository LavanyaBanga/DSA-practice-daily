class Solution {
    public int trap(int[] height) {
        int left = 0;                        // Pointer from start
        int right = height.length - 1;       // Pointer from end
        int leftMax = 0, rightMax = 0;       // Track max heights from both sides
        int trappedWater = 0;

        while (left < right) {
            // Decide to move from the side with the smaller max
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    // Update left max if current is higher
                    leftMax = height[left];
                } else {
                    // Water is trapped here
                    trappedWater += leftMax - height[left];
                }
                left++; // Move left pointer
            } else {
                if (height[right] >= rightMax) {
                    // Update right max
                    rightMax = height[right];
                } else {
                    // Water trapped here
                    trappedWater += rightMax - height[right];
                }
                right--; // Move right pointer
            }
        }

        return trappedWater;
    }
}