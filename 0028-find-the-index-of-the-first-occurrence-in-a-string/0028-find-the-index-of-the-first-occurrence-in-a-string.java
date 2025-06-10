class Solution {
    public int strStr(String haystack, String needle) {
        boolean alpha[]=new boolean[26];
       int n=haystack.length();
       int m=needle.length();
       for(int i=0;i<=n-m;i++){
        if(haystack.substring(i,i+m).equals(needle)){
            return i;
        }
       }
       return -1;
        
    }
}