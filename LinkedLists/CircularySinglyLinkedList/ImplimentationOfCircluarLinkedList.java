package CircularySinglyLinkedList;

public class ImplimentationOfCircluarLinkedList {
    private ListNode last;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public ImplimentationOfCircluarLinkedList() {
        last = null;
    }

    public void print() {
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
        ImplimentationOfCircluarLinkedList implimentationOfCircluarLinkedList = new ImplimentationOfCircluarLinkedList();
        implimentationOfCircluarLinkedList.listt();
        implimentationOfCircluarLinkedList.print();
    }
}
