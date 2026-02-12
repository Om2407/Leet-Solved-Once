public class RemoveNodefrEnd {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode removeNodefrLast (ListNode head,int n){

    ListNode dummy = new ListNode(0);
    dummy.next = head;//head se connect kr diya
    ListNode slow = dummy;
    ListNode fast = dummy;

    for(int i=0; i<n; i++){
        fast= fast.next;
    }
    //alag se chalega
        while(fast.next!= null){
            slow= slow.next;
            fast = fast.next;
        }
        //delete node krne ke liye imp
        slow.next = slow.next.next;
    
    return dummy.next;

}
public static void main(String args[]){

    ListNode list = new ListNode(1);
    list.next =  new ListNode(2);
    list.next.next =  new ListNode(3);
    list.next.next.next =  new ListNode(4);
    list.next.next.next.next = new ListNode(5);

    ListNode removeNthNode = removeNodefrLast(list, 2);

    while(removeNthNode!= null){
        System.out.print(removeNthNode.val + " ");
        removeNthNode = removeNthNode.next;
    }
}
}
