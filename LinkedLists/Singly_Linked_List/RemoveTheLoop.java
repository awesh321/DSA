package Singly_Linked_List;

public class RemoveTheLoop {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode removeLoop() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return removeTheLop(slow);
            }
        }
        return null;

    }

    private ListNode removeTheLop(ListNode slow) {
        ListNode temp = head;
        while (temp.next != slow.next) {
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;
        return slow;
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
        RemoveTheLoop removeTheLoop = new RemoveTheLoop();
        removeTheLoop.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        removeTheLoop.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        removeTheLoop.removeLoop();
        removeTheLoop.printList();

    }
}
