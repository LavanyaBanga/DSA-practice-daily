class Solution {
    public String removeDuplicates(String s) {
      Stack<Character> stack=new Stack<>();
        
     for(char ch:s.toCharArray()){
        if(!stack.isEmpty()&& stack.peek()==ch){
            stack.pop();
        }
        else{
            stack.push(ch);
        }
     }

       
    StringBuilder ch1=new StringBuilder();
    for(char c:stack){
        ch1.append(c);

    }
   return ch1.toString();
    }
}
