package pac3;
import pac2.*;

public class RemoveDuplicatesFromSortedList {
	  public ListNode deleteDuplicates(ListNode head) {
	        ListNode node=head;
	        while(true){
	            if(node==null || node.next==null)
	                break;
	            if(node.val==node.next.val){
	                ListNode temp=node.next.next;
	                node.next=temp;
	            }else
	                node=node.next;
	            
	        }
	        return head;
	        
	        
	    }

}
