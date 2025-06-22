class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();  
            } else {
                stack.push(ch);
            }
        }

       
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }
}
