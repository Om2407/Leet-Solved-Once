public class DetectCycleinLL {
    //leectode - 142
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode detectCycle(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;

            if(slow==fast){
                ListNode temp = head;
            while(temp!=slow){
                    temp =temp.next;
                    slow= slow.next;
                }
                return temp;
            }
        }
        return null;
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
      ListNode detected = detectCycle(head);
      if(detected!=null){
        System.out.println(detected.val+ " is Detected Yeah! ");
      }else{
        System.out.println(" Not Detected");
      }
    }
}
