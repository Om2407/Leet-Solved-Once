public class OddEvenLL {
    static class ListNode{
        int val;
        ListNode next;
        ListNode (int val){
            this.val = val;
        }
    }
    public static ListNode OddandEven(ListNode head){

        ListNode odd =head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even!= null && even.next!=null){

            odd.next = even.next; //1 ->3 hua
            odd = odd.next; // 1 tha 3 hua

            even.next = odd.next;//2.next m 4
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String args[]){
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        ListNode newList = OddandEven(l1);
        while(newList!=null){
            System.out.print(newList.val + " ");
            newList = newList.next;
        }
    }
}
//explaination -> odd=1, even = 2 , evenHead =2
// odd.next = even.next
// 1.next ke 2 h pr abb 3 hoga 1->3 hogya
// odd =odd.next ,odd =3 hogya 
// even.next = odd.next --2.next m 4 hoga
// even = 4(even.next)

//Iteration--2
// odd =3, even=4 
// 3.next = even.next(5) means
// 3.next m 5 hoga --1->3->5
// odd =5;
// even.next = odd.next --4.next = null
// even = null
// last odd.next = evenhead kr denge jiss 1->3->5 ke bdd 2->4
// return head;