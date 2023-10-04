package Singly_Linked_List;

public class InsetNodeAtbegning {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertNode(int a) {
        ListNode node = new ListNode(a);
        ListNode current = head;
        node.next = current;
        head = node;
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
        InsetNodeAtbegning insetNodeAtbegning = new InsetNodeAtbegning();
        insetNodeAtbegning.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        insetNodeAtbegning.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        insetNodeAtbegning.insertNode(20);
        insetNodeAtbegning.printList();

    }
}
