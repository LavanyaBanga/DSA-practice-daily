class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int number = 0, sign = 1, result = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                sign = 1;
                result = 0;
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop(); 
                result += stack.pop(); 
            }
        }

        if (number != 0) {
            result += sign * number;
        }

        return result;
    }
}