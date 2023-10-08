package DoubleLinkkedList;

public class ImplimentationOFDblLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }

    }

    public ImplimentationOFDblLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public void printL() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;

        }
        System.out.println("Null");
    }

    public void printRev() {
        if (tail == null) {
            return;
        }
        ListNode current = tail;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.previous;
        }
        System.out.println("Null");
    }

    public void listt() {
        head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        tail = new ListNode(5);

        head.next = node1;
        node1.previous = head;

        node1.next = node2;
        node2.previous = node1;

        node2.next = node3;
        node3.previous = node2;

        node3.next = node4;
        node4.previous = node3;

        node4.next = tail;
        tail.previous = node4;
    }

    public static void main(String[] args) {
        ImplimentationOFDblLinkedList implimentationOFDblLinkedList = new ImplimentationOFDblLinkedList();
        implimentationOFDblLinkedList.listt();
        implimentationOFDblLinkedList.printL();
        implimentationOFDblLinkedList.printRev();

    }
}
