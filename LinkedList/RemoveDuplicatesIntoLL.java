
public class RemoveDuplicatesIntoLL {
   static class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
   }
   public static ListNode removeDuplintoLL(ListNode head){
    ListNode curr = head;
    while(curr!= null && curr.next!= null){
        if(curr.val == curr.next.val){
            curr.next = curr.next.next;
        }
        else{
            curr = curr.next;
        }
    }
    return head;
   }
   public static void main(String args[]){

    ListNode list1 = new ListNode(1);
    list1.next = new ListNode(2);
    list1.next.next = new ListNode(3);
    list1.next.next.next = new ListNode(3);
    list1.next.next.next.next = new ListNode(4);

    ListNode newList = removeDuplintoLL(list1);
    while(newList!= null){
        System.out.print(newList.val + " ");
        newList = newList.next;
    }
   }
}