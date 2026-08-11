class Solution {
    public int maxArea(int[] height) {
      int p1=0;
      int p2=height.length-1;
      int water=0;
      int ans=0;
      while(p1<p2){
      int w=p2-p1;
        water=w*(Math.min(height[p1],height[p2]));
        ans=Math.max(ans,water);
        if(height[p1]>height[p2]){
            p2--;
        }
        else{
            p1++;
        }
      }
      return ans;
        
    }
}