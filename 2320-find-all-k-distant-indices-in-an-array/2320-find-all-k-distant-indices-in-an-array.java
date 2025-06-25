class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        
        List<Integer> keyIndices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }

     
        for (int i = 0; i < n; i++) {
            for (int j : keyIndices) {
                if (Math.abs(i - j) <= k) {
                    result.add(i);
                    break; 
                }
            }
        }

        return result;
    }
}
