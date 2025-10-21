import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder str = new StringBuilder();

        // Build words and push into stack
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (str.length() > 0) { // avoid pushing empty strings
                    st.push(str.toString());
                    str.setLength(0); // reset string builder
                }
            } else {
                str.append(s.charAt(i));
            }
        }

        // Push the last word if exists
        if (str.length() > 0) {
            st.push(str.toString());
        }

        // Pop from stack to form reversed sentence
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
            if (!st.isEmpty()) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}