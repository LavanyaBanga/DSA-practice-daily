class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time = 0;
        int previous = neededTime[0]; 
        int n = colors.length();

        for (int i = 1; i < n; i++) {
            int current = neededTime[i]; 

            if (colors.charAt(i) == colors.charAt(i - 1)) {
                time += Math.min(previous, current);
                previous = Math.max(previous, current);
            } else {
                previous = current;
            }
        }

        return time;
    }
}
