import java.util.*;
public class ReverseLL{
    // NODE defination
    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }
    }
    //Reverse function
    public static ListNode reverList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
    public static void main(String args[]){
        //creating list 1 -> 2-> 3 ->4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
    //reverse
    ListNode newHead = reverList(head);
    //print reversed list
    while(newHead != null){
        System.out.print(newHead.val + " ");
        newHead = newHead.next;
    }
    }
}