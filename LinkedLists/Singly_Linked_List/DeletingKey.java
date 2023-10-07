package Singly_Linked_List;

public class DeletingKey {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void ddeleteKey(int key) {
        ListNode node = new ListNode(key);
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current.data != node.data) {
            previous = current;
            current = current.next;
        }
        if (current == null)
            return;
        ListNode temp = previous.next.next;
        previous.next = temp;

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
        DeletingKey deletingKey = new DeletingKey();
        deletingKey.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        deletingKey.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        deletingKey.ddeleteKey(3);
        deletingKey.printList();

    }
}
