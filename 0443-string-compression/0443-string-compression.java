class Solution {
    public int compress(char[] chars) {
      int i=0;
      int index=0;
      int n=chars.length;
      while(i<n){
        char current=chars[i];
        int count=0;
        while(i<n && chars[i]==current){
            count++;
            i++;
        }
        chars[index++]=current;
        String current_count=String.valueOf(count);
        if(count>1){
            for(char ch:current_count.toCharArray()){
                chars[index++]=ch;
            }
        }
        
      }
      return index;
    }
}
