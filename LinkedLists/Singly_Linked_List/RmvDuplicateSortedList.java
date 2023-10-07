package Singly_Linked_List;

public class RmvDuplicateSortedList {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void removeDuplicate() {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                ListNode temp = current.next.next;
                current.next = null;
                current.next = temp;
            } else {
                current = current.next;
            }
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
        RmvDuplicateSortedList rmvDuplicateSortedList = new RmvDuplicateSortedList();
        rmvDuplicateSortedList.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        rmvDuplicateSortedList.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        rmvDuplicateSortedList.printList();
        rmvDuplicateSortedList.removeDuplicate();
        rmvDuplicateSortedList.printList();

    }
}
