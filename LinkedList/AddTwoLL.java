public class AddTwoLL{
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode AddTwo(ListNode l1, ListNode l2){

        ListNode head = null;
        ListNode temp = null;
        int carry = 0;
        while(l1!=null || l2!=null || carry !=0){
            int val1 = (l1==null)?0:l1.val;
            int val2 = (l2==null)?0:l2.val;

            int value = val1 + val2 + carry;

            ListNode newNode = new ListNode(value%10);
            carry = value/10;

            if(head==null){
                head = newNode;
                temp = newNode;
            }else{
                temp.next = newNode;
                temp = temp.next;
            }
            if(l1!=null){
                l1= l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            
        }
        return head;
    }
    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val);
            if(head.next!=null){
                System.out.print(" -> ");
               
            }
             head = head.next;
        }
            System.out.println();

    }
    public static void main(String args[]){
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode finalNode = AddTwo(l1, l2);
        System.out.print("Result : = ");
        printList(finalNode);
    }
}