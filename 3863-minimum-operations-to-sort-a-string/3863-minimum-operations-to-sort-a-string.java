class Solution {
    public int minOperations(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        
        // Step 1: Find the global minimum and maximum characters
        // and check if the string is already sorted.
        boolean isSorted = true;
        char mn = cs[0];
        char mx = cs[0];
        
        for (int i = 1; i < n; ++i) {
            if (cs[i] < cs[i - 1]) {
                isSorted = false;
            }
            if (cs[i] < mn) mn = cs[i];
            if (cs[i] > mx) mx = cs[i];
        }
        
        if (isSorted) {
            return 0;
        }
        
        // Step 2: Handle the size 2 edge case
        if (n == 2) {
            return -1;
        }
        
        // Step 3: Check if 1 operation is sufficient
        if (cs[0] == mn || cs[n - 1] == mx) {
            return 1;
        }
        
        // Step 4: Check if 2 operations are sufficient (extreme character in the middle)
        for (int i = 1; i < n - 1; ++i) {
            if (cs[i] == mn || cs[i] == mx) {
                return 2;
            }
        }
        
        // Step 5: Otherwise, it takes 3 operations
        return 3;
    }
}