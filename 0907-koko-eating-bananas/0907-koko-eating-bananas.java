class Solution {
    public int calculate(int[] piles, int mid) {
        int hrs = 0;

        for (int x : piles) {
            hrs += (x + mid - 1) / mid;
        }

        return hrs;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt(); 
        while (left < right) {
            int mid = left + (right - left) / 2;

            int time = calculate(piles, mid);

            if (time <= h) {
                right = mid;      
            } else {
                left = mid + 1;   
            }
        }

        return left;
    }
}
