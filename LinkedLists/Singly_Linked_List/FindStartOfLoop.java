package Singly_Linked_List;

public class FindStartOfLoop {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode findstart() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return startofLoop(slow);
            }
        }
        return null;
    }

    private ListNode startofLoop(ListNode slow) {
        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        FindStartOfLoop findStartOfLoop = new FindStartOfLoop();
        findStartOfLoop.head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        findStartOfLoop.head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        System.out.println(findStartOfLoop.findstart().data);

    }
}
