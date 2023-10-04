package Singly_Linked_List;

public class DeletedNodeAtGivenPosition {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void deleteAtgiven(int pos) {
        if (pos == 1) {
            head = head.next;
        } else {
            ListNode current = head;
            int count = 1;
            while (count < pos - 1) {
                current = current.next;
                count++;
            }
            ListNode temp = current.next.next;
            current.next = null;
            current.next = temp;
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
        DeletedNodeAtGivenPosition deletedNodeAtGivenPosition = new DeletedNodeAtGivenPosition();
        deletedNodeAtGivenPosition.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        deletedNodeAtGivenPosition.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        deletedNodeAtGivenPosition.deleteAtgiven(1);
        deletedNodeAtGivenPosition.printList();

    }

}
