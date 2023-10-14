package StackAndQueue.Stack;

import java.util.Stack;

public class ValidParenthese {

    public boolean ValidParenthese(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '{' || arr[i] == '[' || arr[i] == '(') {
                stack.push(arr[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if (arr[i] == ')' && top == '(' ||
                            arr[i] == ']' && top == '[' ||
                            arr[i] == '}' && top == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }

                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthese validParenthese = new ValidParenthese();
        System.out.println(validParenthese.ValidParenthese("({}"));
    }
}
