import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] result = new int[intervals.length][2];
        int index = -1;

        for (int[] curr : intervals) {
            if (index == -1 || result[index][1] < curr[0]) {
            
                result[++index] = curr;
            } else {
            
                result[index][1] = Math.max(result[index][1], curr[1]);
            }
        }

        return Arrays.copyOf(result, index + 1);
    }
}
