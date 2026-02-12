public class DeleteNodeinLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public static void main(String args[]){
        ListNode list = new ListNode(4);
        list.next = new ListNode(1);
        list.next.next = new ListNode(5);
        list.next.next.next = new ListNode(9);

        deleteNode(list.next);

        ListNode finalList = list;
        while(finalList!= null){
            System.out.print(finalList.val + " ");
            finalList = finalList.next;
        }
    }
}
