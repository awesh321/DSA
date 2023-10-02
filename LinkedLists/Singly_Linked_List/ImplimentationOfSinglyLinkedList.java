package Singly_Linked_List;

public class ImplimentationOfSinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
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
        ImplimentationOfSinglyLinkedList implimentationOfSinglyLinkedList = new ImplimentationOfSinglyLinkedList();
        implimentationOfSinglyLinkedList.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        implimentationOfSinglyLinkedList.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        implimentationOfSinglyLinkedList.printList();

    }

}
