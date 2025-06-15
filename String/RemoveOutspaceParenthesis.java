package String;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder(); // To build the final string
        int balance = 0; // To keep track of the depth of parentheses

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    result.append(c); // Not the outermost '(', so add to result
                }
                balance++; // Increase depth
            } else if (c == ')') {
                balance--; // Decrease depth
                if (balance > 0) {
                    result.append(c); // Not the outermost ')', so add to result
                }
            }
        }

        return result.toString(); // Convert StringBuilder to String
    }
}
