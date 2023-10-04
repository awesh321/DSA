package Singly_Linked_List;

public class SearchAnElement {

    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean searchNode(int a) {
        ListNode node = new ListNode(a);
        ListNode current = head;
        while (current.next != null) {
            if (node.data == current.data) {
                return true;
            }
            current = current.next;
        }
        return false;
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
        SearchAnElement searchAnElement = new SearchAnElement();
        searchAnElement.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        searchAnElement.head.next = node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println(searchAnElement.searchNode(2));
        // searchAnElement.printList();

    }
}
