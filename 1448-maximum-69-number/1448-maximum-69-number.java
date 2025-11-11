class Solution {
    public int maximum69Number (int num) {
      int placeValue=0;
      int placeValueSix=-1;
      int temp=num;
      while(temp>0){
        int rem=temp%10;
        if(rem==6){
            placeValueSix=placeValue;
            
        }
        temp/=10;
        placeValue++;
      }
      if(placeValueSix==-1)return num;
      return num+(int)(3*Math.pow(10,placeValueSix));
    }
}
