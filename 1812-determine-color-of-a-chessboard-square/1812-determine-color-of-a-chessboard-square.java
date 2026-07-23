class Solution {
    public boolean squareIsWhite(String c) {
        int a=(int) c.charAt(0);
        int b=(int)c.charAt(1)-'0';
        if((a%2!=0)&&(b%2!=0)){
            return false;
        }
        if((a%2==0)&&(b%2==0)){
            return false;
        }
     return true;  
        
    }
}