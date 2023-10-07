package Singly_Linked_List;

public class ReverseSinglyLinked {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode reverseList() {
        ListNode current = head;
        ListNode previous = null;
        ListNode nextt = null;
        while (current != null) {
            nextt = current.next;
            current.next = previous;
            previous = current;
            current = nextt;

        }
        return previous;
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseSinglyLinked reverseSinglyLinked = new ReverseSinglyLinked();
        reverseSinglyLinked.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        reverseSinglyLinked.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        reverseSinglyLinked.printList();
        reverseSinglyLinked.reverseList();
        reverseSinglyLinked.printList();

    }
}
