package pac2;

public class MiddleOfTheLinkedList {
	public ListNode middleNode(ListNode head) {
        ListNode slow=head,fast=head;
        while(true){
            if(fast.next!=null &&fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            else if(fast.next!=null && fast.next.next==null){
                return slow.next;
               // break;
            }
            else{
                return slow;
            }
        }
        
    }

}
