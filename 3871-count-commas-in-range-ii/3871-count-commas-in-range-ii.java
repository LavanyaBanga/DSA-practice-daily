class Solution {
    public long countCommas(long n) {
        long cnt=0L;
        for(long i=1000;i<=n;i*=1000) cnt += n+1-i;
        return cnt;
    }
}