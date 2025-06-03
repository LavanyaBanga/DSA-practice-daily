class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int index = 0;

      
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }

     
        for (int num : nums) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        return result;
    }
}
