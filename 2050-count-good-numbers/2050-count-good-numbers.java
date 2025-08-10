class Solution {
    static final long MOD = 1000000007L;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // ceil
        long oddCount  = n / 2;       // floor

        long part1 = power(5, evenCount); // 5^(even positions)
        long part2 = power(4, oddCount);  // 4^(odd positions)

        return (int) ((part1 * part2) % MOD);
    }

    private long power(long base, long exp) {
        if (exp == 0) return 1;
        base %= MOD; // keep base small

        long half = power(base, exp / 2);
        long result = (half * half) % MOD;

        if ((exp & 1) == 1) {
            result = (result * base) % MOD;
        }
        return result;
    }
}
