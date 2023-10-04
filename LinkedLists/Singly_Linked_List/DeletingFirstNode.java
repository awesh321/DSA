package Singly_Linked_List;

public class DeletingFirstNode {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void delitingFirst() {
        ListNode current = head;
        head = current.next;
        current.next = null;
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
        DeletingFirstNode deletingFirstNode = new DeletingFirstNode();
        deletingFirstNode.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        deletingFirstNode.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        deletingFirstNode.delitingFirst();
        deletingFirstNode.printList();

    }

}
