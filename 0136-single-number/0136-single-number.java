import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> a = new HashMap<>();
        for (int b : nums) {
            a.put(b, a.getOrDefault(b, 0) + 1);
        }
        for (int key : a.keySet()) {
            if (a.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
}
