class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ']' || ch == '}' || ch == ')') {
                if (st.empty()) return false;

                if ((st.peek() == '[' && ch == ']') ||
                    (st.peek() == '{' && ch == '}') ||
                    (st.peek() == '(' && ch == ')')) {
                        st.pop();
                }

                else return false;
            }

            else {
                st.push(ch);
            }
        }

        return st.empty();
    }
}
