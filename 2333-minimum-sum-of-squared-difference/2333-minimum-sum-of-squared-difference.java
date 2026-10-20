class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] diff = new int[100001];
        // maximum difference can be 100000-0=100000
        long total_diff=0;
        int max=0;
        for(int i=0 ; i<nums1.length ; i++){
           int x = Math.abs(nums1[i]-nums2[i]);
           diff[x]++;
           total_diff += x;
           max = Math.max(max,x);
        }
        long ans=0;
        k1+=k2;
        if(total_diff<=k1) return 0;
        for(int i=max ; i>0 && k1>0 ; i--){
            if(diff[i]<k1){
                diff[i-1]+=diff[i];
                k1-=diff[i];
                diff[i]=0;
            }else{
                diff[i-1] += k1;
                diff[i] -= k1;
                k1=0;
            }
        }
        for(int i=max ; i>0 ; i--) ans += diff[i]*(long)i*i;
        return ans;
    }
}