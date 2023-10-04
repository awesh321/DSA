package Singly_Linked_List;

public class InsertNodeAtLast {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtLast(int a) {
        ListNode node = new ListNode(a);
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        node.next = null;
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
        InsertNodeAtLast insertNodeAtLast = new InsertNodeAtLast();
        insertNodeAtLast.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        insertNodeAtLast.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        insertNodeAtLast.insertAtLast(50);
        insertNodeAtLast.printList();

    }
}
