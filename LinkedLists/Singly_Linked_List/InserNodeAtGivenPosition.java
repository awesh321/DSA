package Singly_Linked_List;

public class InserNodeAtGivenPosition {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtGivenPos(int pos, int value) {
        ListNode node = new ListNode(value);
        if (pos == 1) {
            node.next = head;
            head = node;
        } else {
            int count = 1;
            ListNode previous = head;
            while (count < pos - 1) {
                previous = previous.next;
                count++;
            }
            ListNode temp = previous.next;
            previous.next = node;
            node.next = temp;

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
        InserNodeAtGivenPosition inserNodeAtGivenPosition = new InserNodeAtGivenPosition();
        inserNodeAtGivenPosition.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        inserNodeAtGivenPosition.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        inserNodeAtGivenPosition.insertAtGivenPos(3, 100);
        inserNodeAtGivenPosition.printList();

    }
}
