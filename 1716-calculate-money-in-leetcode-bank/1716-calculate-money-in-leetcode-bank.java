class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int weeks = n / 7;
        int rem = n % 7;

        // Complete weeks
        for (int i = 0; i < weeks; i++) {
            for (int j = i + 1; j <= i + 7; j++) {
                sum += j;
            }
        }

        // Remaining days
        for (int i = weeks + 1; i <= rem + weeks; i++) {
            sum += i;
        }

        return sum;
    }
}