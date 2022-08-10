package general;

public class DetectLinkedListCycle {
	public static ListNode detectCycle(ListNode head) {
		  ListNode slow=head,fast=head;
	        while(true){
	            if(fast==null ||fast.next==null)return null;
	            slow=slow.next;
	            fast=fast.next.next;
	            if(fast==slow){
	                
	                break;
	                
	            }
	        }
	      
	        while(head!=slow){
	            head=head.next;
	            slow=slow.next;
	        }
	        return slow;
	        
	}

}
