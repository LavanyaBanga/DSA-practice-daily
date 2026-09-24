class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {

        int[] ret = new int[n];
        ret[0] = 1;

        int[] indexes = new int[primes.length];

        for (int i = 1; i < n; i++) {

            long min = Long.MAX_VALUE;

            for (int j = 0; j < primes.length; j++) {
                long candidate = (long) primes[j] * ret[indexes[j]];
                min = Math.min(min, candidate);
            }

            ret[i] = (int) min;

            for (int j = 0; j < primes.length; j++) {
                long candidate = (long) primes[j] * ret[indexes[j]];

                if (ret[i] == candidate) {
                    indexes[j]++;
                }
            }
        }

        return ret[n - 1];
    }
}