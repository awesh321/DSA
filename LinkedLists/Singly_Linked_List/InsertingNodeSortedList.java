package Singly_Linked_List;

public class InsertingNodeSortedList {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertingNodeSortedLists(int a) {
        ListNode node = new ListNode(a);
        ListNode current = head;
        ListNode temp = null;
        while (current != null && node.data > current.data) {
            temp = current;
            current = current.next;
        }
        ListNode loc = temp.next;
        temp.next = node;
        node.next = loc;

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
        InsertingNodeSortedList insertingNodeSortedList = new InsertingNodeSortedList();
        insertingNodeSortedList.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);

        insertingNodeSortedList.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        insertingNodeSortedList.insertingNodeSortedLists(3);
        insertingNodeSortedList.printList();

    }
}
