package StackAndQueue.Stack;

import java.util.EmptyStackException;

public class ImplementStack {

    private ListNode top;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ImplementStack() {
        top = null;
    }

    public void push(int data) { // to add new node in the stack
        ListNode node = new ListNode(data);
        node.next = top;
        top = node;

    }

    public int pop() { // to remove top node int the stack
        if (top == null) {
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        return result;
    }

    public int peek() { // to show the top value in stack
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public void printStack() {
        ListNode current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        ImplementStack implementStack = new ImplementStack();
        implementStack.push(10);
        implementStack.push(11);
        implementStack.push(12);
        implementStack.push(13);
        implementStack.push(14);

        implementStack.pop();
        System.out.println(implementStack.peek());
        implementStack.printStack();

    }

}
