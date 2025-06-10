class Solution {
    public boolean isPalindrome(String s) {
     StringBuilder str=new StringBuilder();
     for(char ch:s.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
            str.append(Character.toLowerCase(ch));

        }
     }
     return str.toString().equals(str.reverse().toString());

       }
    }

