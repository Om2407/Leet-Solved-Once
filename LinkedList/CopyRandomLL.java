public class CopyRandomLL {

    static class ListNode {
        int val;
        ListNode next;
        ListNode random;

        ListNode(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static ListNode copyRandomList(ListNode head) {

        if (head == null) return null;

        ListNode old = head;

        // 🔹 STEP 1: Insert copied nodes
        while (old != null) {
            ListNode copy = new ListNode(old.val);
            copy.next = old.next;
            old.next = copy;
            old = copy.next;
        }

        // 🔹 STEP 2: Set random pointers
        old = head;
        while (old != null) {
            if (old.random != null) {
                old.next.random = old.random.next;
            }
            old = old.next.next;
        }

        // 🔹 STEP 3: Separate lists
        old = head;
        ListNode newHead = head.next;
        ListNode newTemp = newHead;

        while (old != null) {

            old.next = old.next.next;

            if (newTemp.next != null) {
                newTemp.next = newTemp.next.next;
            }

            old = old.next;
            newTemp = newTemp.next;
        }

        return newHead;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            int randomVal = (head.random != null) ? head.random.val : -1;
            System.out.println("Val: " + head.val + 
                               " Random: " + randomVal);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        n1.random = n3;
        n2.random = n1;
        n3.random = n2;

        System.out.println("Original List:");
        printList(n1);

        ListNode copied = copyRandomList(n1);

        System.out.println("\nCopied List:");
        printList(copied);
    }
}
