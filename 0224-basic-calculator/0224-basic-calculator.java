import java.util.*;

class Solution {
    public int calculate(String s) {
        int n = s.length();
        int number = 0;
        int result = 0;
        int sign = 1; // 1 for positive, -1 for negative
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0'); // build the number
            } else if (c == '+') {
                result += number * sign;
                number = 0;
                sign = 1; // next number is positive
            } else if (c == '-') {
                result += number * sign;
                number = 0;
                sign = -1; // next number is negative
            } else if (c == '(') {
                // Push current result and sign for later
                stack.push(result);
                stack.push(sign);
                // Reset for inner expression
                result = 0;
                sign = 1;
            } else if (c == ')') {
                result += number * sign;
                number = 0;
                int prevSign = stack.pop();
                int prevResult = stack.pop();
                result = prevResult + prevSign * result;
            }
        }
        // Add last number
        result += number * sign;

        return result;
    }
}
