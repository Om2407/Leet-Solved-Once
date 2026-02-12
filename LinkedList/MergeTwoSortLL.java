public class MergeTwoSortLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode mergeTwoNode(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            } else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1 != null){
            temp.next = list1;
        }
        else{
            temp.next = list2;
        }
        return dummy.next;
}
public static void main(String args[]){
    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(3);
    l1.next.next = new ListNode(5);

    ListNode l2 = new ListNode(2);
    l2.next = new ListNode(4);
    l2.next.next = new ListNode(6);

    ListNode merged = mergeTwoNode(l1, l2);

    while(merged !=null){
        System.out.print(merged.val + " ");
        merged = merged.next;
    }
}
}
