class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int longest=1;
        Set<Integer>st=new HashSet<>();
        for(int n:nums){
            st.add(n);
        }
        for(int i:st){
            if(!st.contains(i-1)){
                int cnt=1;
                int x=i;
                while(st.contains(x+1)){
                    cnt++;
                    x++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}