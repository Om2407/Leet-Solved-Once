public class PalindromeLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static boolean isPalindromeLL(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
//step-1 middle find krna 1->2->2->1
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse krne ll ko iss part ko 2->1
        ListNode prev =null;
        ListNode curr = slow;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        while(prev!=null){
            if(head.val!= prev.val){
                return false;
            }
            head= head.next;
            prev = prev.next;
        }
        return true;
    }
    public static void main(String args[]){

        ListNode List = new ListNode(1);
        List.next = new ListNode(2);
        List.next.next = new ListNode(2);
        List.next.next.next = new ListNode(1);

        System.out.println(isPalindromeLL(List));
    }
}
