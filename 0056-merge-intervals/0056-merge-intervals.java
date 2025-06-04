class Solution {
    public int[][] merge(int[][] intervals) {
       
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> mergedIntervals = new ArrayList<>();
        int[] lastInterval = null;

        for (int[] currentInterval : intervals) {

           
            if (lastInterval == null || currentInterval[0] > lastInterval[1]) {
                mergedIntervals.add(currentInterval);
                lastInterval = currentInterval;
            } 
            
            else if (currentInterval[1] > lastInterval[1]) {
                lastInterval[1] = currentInterval[1];
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
    }
}
