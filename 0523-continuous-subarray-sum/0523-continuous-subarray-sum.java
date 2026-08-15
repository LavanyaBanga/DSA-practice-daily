import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {

            prefix+= nums[i];

            int rem = prefix % k;

            if (map.containsKey(rem)) {

                int previous = map.get(rem);

                if (i - previous >= 2) {
                    return true;
                }

            } else {

                map.put(rem, i);
            }
        }

        return false;
    }
}