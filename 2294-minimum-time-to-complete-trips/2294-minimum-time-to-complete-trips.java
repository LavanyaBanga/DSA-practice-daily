class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left = 1;
        long right = (long) time[0] * totalTrips;

        for (int t : time) {
            right = Math.min(right, (long) t * totalTrips);
        }

        while (left < right) {
            long mid = left + (right - left) / 2;

            long trips = 0;
            for (int t : time) {
                trips += mid / t;
            }

            if (trips >= totalTrips) {
                right = mid;   
            } else {
                left = mid + 1; 
            }
        }

        return left;
    }
}
