import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(String.valueOf(ch));
            }
            if (stack.isEmpty() && ch == ')') {
                return false;
            }
            if (!stack.isEmpty() && ch == ')') {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}