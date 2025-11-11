class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int prev = neededTime[0];
        int n = colors.length();

        for (int i = 1; i < n; i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
             time += Math.min(prev, neededTime[i]);
             prev = Math.max(prev, neededTime[i]);
            } else {
               
                prev = neededTime[i];
            }
        }
        return time;
    }
}
