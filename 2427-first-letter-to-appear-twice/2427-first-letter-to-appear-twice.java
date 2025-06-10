class Solution {
    public char repeatedCharacter(String s) {
     boolean alpha[]=new boolean[26];
     for(char c:s.toCharArray()){
        if(alpha[c-'a']){
            return c;
        }
        alpha[c-'a']=true;
     }
     return ' ';
    }
}
