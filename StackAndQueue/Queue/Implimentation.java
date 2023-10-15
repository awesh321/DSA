package StackAndQueue.Queue;

import java.util.NoSuchElementException;

public class Implimentation {
    ListNode front;
    ListNode rear;
    int length;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Implimentation() {
        front = null;
        rear = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmplty() {
        return length == 0;
    }

    public void enqueue(int a) {
        ListNode node = new ListNode(a);
        if (isEmplty()) {
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
        length++;

    }

    public void dequeue() {
        if (isEmplty()) {
            throw new NoSuchElementException();
        }
        ListNode current = front;
        front = front.next;
        current.next = null;
        length--;
    }

    public void print() {
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Implimentation implimentation = new Implimentation();
        implimentation.enqueue(0);
        implimentation.enqueue(1);
        implimentation.enqueue(2);
        implimentation.enqueue(3);
        implimentation.enqueue(4);

        implimentation.print();
        implimentation.dequeue();
        implimentation.print();

    }

}
