class Solution {

    private static final long mod = (long) 1e9 + 7;
    private long[] sum;
    private long[] squares;
    private long[] lazy;
    private int n;

    public int sumCounts(int[] nums) {
        n = nums.length;

        sum = new long[4 * n];
        squares = new long[4 * n];
        lazy = new long[4 * n];

        int[] last = new int[100001];
        Arrays.fill(last, -1);

        long res = 0;

        for (int i = 0; i < n; i++) {
            int p = last[nums[i]];
            update(1, 0, n - 1, p + 1, i, 1);
            res = (res + squares[1]) % mod;
            last[nums[i]] = i;
        }

        return (int) res;
    }

    private void apply(int node, int left, int right, long x) {
        long len = right - left + 1;

        squares[node] = (squares[node] + 2L * x % mod * sum[node] % mod + x * x % mod * len % mod) % mod;

        sum[node] = (sum[node] + x * len) % mod;
        lazy[node] = (lazy[node] + x) % mod;
    }

    private void pushDown(int node, int left, int right) {
        if (lazy[node] == 0 || left == right) {
            return;
        }

        int mid = left + (right - left) / 2;
        long x = lazy[node];

        apply(node * 2, left, mid, x);
        apply(node * 2 + 1, mid + 1, right, x);

        lazy[node] = 0;
    }

    private void pullUp(int node) {
        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % mod;
        squares[node] = (squares[node * 2] + squares[node * 2 + 1]) % mod;
    }

    private void update(int node, int left, int right,
            int ql, int qr, long x) {
        if (ql > right || qr < left || ql > qr) {
            return;
        }

        if (ql <= left && right <= qr) {
            apply(node, left, right, x);
            return;
        }

        pushDown(node, left, right);

        int mid = left + (right - left) / 2;

        update(node * 2, left, mid, ql, qr, x);
        update(node * 2 + 1, mid + 1, right, ql, qr, x);

        pullUp(node);
    }
}