
class Solution {
    public int missingNumber(int[] nums) {
    
    
        int n=nums.length;
        int sum=n*(n+1)/2;
         int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
           
          
        }
        int missing=sum-sum1;
        return missing;
        
    }
}