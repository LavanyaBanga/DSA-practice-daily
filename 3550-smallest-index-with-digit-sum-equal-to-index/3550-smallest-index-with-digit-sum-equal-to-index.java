class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            if(i==answer(nums[i])){
                return i;
            }
        }
        return -1;
    }
    public int answer(int n){
        int ans=0;
        while(n>0){
            ans += n%10;
            n/=10;
        }
        return ans;
    }
}