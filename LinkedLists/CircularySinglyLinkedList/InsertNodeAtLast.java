package CircularySinglyLinkedList;

public class InsertNodeAtLast {
    private ListNode last;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public InsertNodeAtLast() {
        last = null;
    }

    public void insertNodeAtLast(int a) {
        ListNode node = new ListNode(a);
        if (last == null) {
            last = node;
            last.next = last;
        }

        ListNode temp = last.next;
        last.next = node;
        last = node;
        node.next = temp;

    }

    public void print() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + "-->");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void listt() {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;
        last = node4;

    }

    public static void main(String[] args) {
        InsertNodeAtLast insertNodeAtLast = new InsertNodeAtLast();
        insertNodeAtLast.listt();
        insertNodeAtLast.insertNodeAtLast(100);
        insertNodeAtLast.print();
    }
}
