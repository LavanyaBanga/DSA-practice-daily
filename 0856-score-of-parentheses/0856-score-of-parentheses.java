class Solution {
    public int scoreOfParentheses(String s) {
        ArrayDeque<Integer> stack = new ArrayDeque<>(); 
        int run = 0; 
        stack.push(0); // starting score 
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(0); 
            } else {
                int a = stack.pop(); 
                if(a == 0) a = 1; 
                else a *= 2; 

                stack.push(stack.pop() + a); 
            }
        } 
         return stack.pop(); 
    }
}