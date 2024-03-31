package org.example.Problem_Solving.Balanced_Brackets;

import java.util.Stack;

public class Result {
    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char lastOpen = stack.pop();
                if ((c == ')' && lastOpen != '(') ||
                        (c == ']' && lastOpen != '[') ||
                        (c == '}' && lastOpen != '{')) {
                    return "NO";
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

}
