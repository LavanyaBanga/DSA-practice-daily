public class Solution {
   // Function to count number of 1 b its
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            n = n & (n - 1); 
            count++;
        }

        return count;
    }
} 