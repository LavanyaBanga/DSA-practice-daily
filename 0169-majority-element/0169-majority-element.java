class Solution {
    public int majorityElement(int[] nums) {
     int majority=0;
     int votes=0;
     for(int num:nums){
        if(votes==0)majority=num;
        if(num==majority)votes++;
        else{
            votes--;
        }
     }
     return majority;
    }
}