package StackAndQueue.Stack;

import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreater(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && arr[i] > stack.peek()) {
                    stack.pop();
                }

            }
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);

        }
        return result;

    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] arr = { 4, 7, 3, 4, 8, 1 };
        int[] b = nextGreaterElement.nextGreater(arr);
        nextGreaterElement.printArr(b);
    }

}
