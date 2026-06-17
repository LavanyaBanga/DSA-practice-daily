import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        try {

            for (char ch : s.toCharArray()) {

                if (ch == '(' || ch == '{' || ch == '[') {
                    st.push(ch);
                }

                else if (ch == ')') {
                    if (st.pop() != '(') {
                        return false;
                    }
                }

                else if (ch == '}') {
                    if (st.pop() != '{') {
                        return false;
                    }
                }

                else if (ch == ']') {
                    if (st.pop() != '[') {
                        return false;
                    }
                }
            }

            return st.isEmpty();

        } catch (Exception e) {
            return false;
        }
    }
}