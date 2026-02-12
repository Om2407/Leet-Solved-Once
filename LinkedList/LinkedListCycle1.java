public class LinkedListCycle1 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static boolean hasCycle(ListNode head){
        if(head ==null || head.next ==null)
            return false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
           slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ListNode head = new ListNode(1);
       ListNode second = new ListNode(2);
       ListNode third = new ListNode(3);
       ListNode fourth = new ListNode(4);
      //connect kr diya
       head.next = second;
      second.next = third;
      third.next = fourth;

      //create cycle
      fourth.next = second;
      System.out.println(hasCycle(head));
    }
}
