package Singly_Linked_List;

public class AddTwoNumbers {
    private ListNode head;

    private static class ListNode {
        private int data; // Genric type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
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

    public ListNode addt(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            if (a != null)
                a = a.next;
            if (b != null)
                b = b.next;

            if (carry > 0) {
                temp.next = new ListNode(carry);
            }

        }
        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        addTwoNumbers.insertAtLast(7);
        addTwoNumbers.insertAtLast(4);
        addTwoNumbers.insertAtLast(9);
        addTwoNumbers.insertAtLast(7);
        addTwoNumbers.insertAtLast(9);

        AddTwoNumbers addTwoNumbers2 = new AddTwoNumbers();

        addTwoNumbers2.insertAtLast(5);
        addTwoNumbers2.insertAtLast(6);
        addTwoNumbers2.insertAtLast(6);
        addTwoNumbers2.insertAtLast(8);

        ListNode result = addTwoNumbers.addt(addTwoNumbers.head, addTwoNumbers2.head);
        AddTwoNumbers resultLinkedList = new AddTwoNumbers();
        resultLinkedList.head = result;
        resultLinkedList.printList();

    }
}
