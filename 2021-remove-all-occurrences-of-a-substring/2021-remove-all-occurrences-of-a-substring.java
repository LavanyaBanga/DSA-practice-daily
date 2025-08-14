class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        int m = part.length();

        for (char ch : s.toCharArray()) {
            st.push(ch);

            if (st.size() >= m && check(st, part)) {
                for (int j = 0; j < m; j++) {
                    st.pop();
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : st) {
            result.append(ch);
        }
        return result.toString();
    }

    
    public boolean check(Stack<Character> st, String part) {
        int size = st.size();
        for (int i = 0; i < part.length(); i++) {
            if (st.get(size - part.length() + i) != part.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
