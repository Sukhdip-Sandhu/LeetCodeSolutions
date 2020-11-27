import java.util.Stack;


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (stack.isEmpty()) {
                return false;
            } else if (c == ')') {
                if (!stack.pop().equals('(')) {
                    return false;
                }
            } else if (c == ']') {
                if (!stack.pop().equals('[')) {
                    return false;
                }
            } else if (c == '}') {
                if (!stack.pop().equals('{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}