package CircularySinglyLinkedList;

public class DeleteAtFirst {
    private ListNode last;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DeleteAtFirst() {
        last = null;
    }

    public ListNode deleteAtFirst() {
        if (last.next == last) {
            return null;
        }
        ListNode temp = last.next.next;
        last.next = null;
        last.next = temp;

        return temp;

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
        DeleteAtFirst deleteAtFirst = new DeleteAtFirst();
        deleteAtFirst.listt();
        deleteAtFirst.print();
        deleteAtFirst.deleteAtFirst();
        deleteAtFirst.print();

    }
}
