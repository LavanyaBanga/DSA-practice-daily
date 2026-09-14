class Solution {
    public double myPow(double x, int n) {
   long exp=n;
    if(exp<0){
     x=1/x;
     exp=-exp;
   }
   double ans=1;
    while(exp>0){
    if(exp%2!=0){
        ans*=x;

    }
    x*=x;
    exp=exp/2;
    
   }
   return ans;

    }
}