class Solution {
    public int countEven(int num) {
        int sum = num % 10 + (num / 10) % 10 + (num / 100) % 10 + (num / 1000) % 10;
        if(sum%2==0 && num%2 == 0){
            return (num-1)/2 +1;
        }
        else{
            return (num-1)/2;
        }
    }
}