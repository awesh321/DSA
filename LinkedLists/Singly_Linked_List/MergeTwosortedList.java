package Singly_Linked_List;

public class MergeTwosortedList {
    ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;

            if (a == null) {
                tail.next = b;
            } else {
                tail.next = a;
            }

        }
        return dummy.next;

    }

    public void insertAtLast(int a) {
        ListNode node = new ListNode(a);
        if (head == null) {
            head = node;
        }
        ListNode current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        node.next = null;
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
        MergeTwosortedList mergeTwosortedList = new MergeTwosortedList();

        mergeTwosortedList.insertAtLast(1);
        mergeTwosortedList.insertAtLast(3);
        mergeTwosortedList.insertAtLast(5);
        mergeTwosortedList.insertAtLast(7);
        mergeTwosortedList.insertAtLast(9);

        MergeTwosortedList mergeTwosortedList2 = new MergeTwosortedList();

        mergeTwosortedList2.insertAtLast(2);
        mergeTwosortedList2.insertAtLast(4);
        mergeTwosortedList2.insertAtLast(6);
        mergeTwosortedList2.insertAtLast(8);

        mergeTwosortedList.merge(mergeTwosortedList.head, mergeTwosortedList2.head);
        mergeTwosortedList.printList();

    }
}
