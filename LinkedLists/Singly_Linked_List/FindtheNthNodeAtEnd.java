package Singly_Linked_List;

public class FindtheNthNodeAtEnd {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode findNthNode(int a) {
        ListNode current = head;
        ListNode previous = head;
        int count = 1;
        while (count < a) {
            current = current.next;
            count++;
        }
        while (current != null && current.next != null) {
            previous = previous.next;
            current = current.next;
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
        FindtheNthNodeAtEnd findtheNthNodeAtEnd = new FindtheNthNodeAtEnd();
        findtheNthNodeAtEnd.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        findtheNthNodeAtEnd.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        findtheNthNodeAtEnd.printList();
        System.out.println(findtheNthNodeAtEnd.findNthNode(2).data);

    }
}
