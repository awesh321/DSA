package StackAndQueue.Stack;

import java.util.Stack;

public class ReverseAStringUsingStack {

    public String revString(String a) {
        char arr[] = a.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        ReverseAStringUsingStack reverseAStringUsingStack = new ReverseAStringUsingStack();
        System.out.println(reverseAStringUsingStack.revString("Awesh"));
    }

}
