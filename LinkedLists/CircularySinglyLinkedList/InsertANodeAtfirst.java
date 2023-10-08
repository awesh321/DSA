package CircularySinglyLinkedList;

public class InsertANodeAtfirst {
    private ListNode last;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public InsertANodeAtfirst() {
        last = null;
    }

    public void insertANodeAtfirst(int a) {
        ListNode node = new ListNode(a);
        if (last == null) {
            last = node;
        }
        ListNode first = last.next;
        last.next = node;
        node.next = first;

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
        InsertANodeAtfirst insertANodeAtfirst = new InsertANodeAtfirst();
        insertANodeAtfirst.listt();
        insertANodeAtfirst.insertANodeAtfirst(100);
        insertANodeAtfirst.print();
    }
}
