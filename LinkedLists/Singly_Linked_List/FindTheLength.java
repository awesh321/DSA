package Singly_Linked_List;

public class FindTheLength {

    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int findLength() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        FindTheLength findTheLength = new FindTheLength();
        findTheLength.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        findTheLength.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println(findTheLength.findLength());

    }

}
