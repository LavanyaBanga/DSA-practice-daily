class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] ans = new int[seq.length()];
        int open=-1;
        for(int i=0 ; i<ans.length ; i++){
            if(seq.charAt(i)=='('){
                open++;
                ans[i]=open%2;
            }else{
                ans[i]=open%2;
                open--;
            }
        }
        return ans;
    }
}