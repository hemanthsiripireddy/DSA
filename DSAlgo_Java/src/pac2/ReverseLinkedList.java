package pac2;

public class ReverseLinkedList {
	   ListNode newNode;
	    public ListNode reverseList(ListNode head) {
	        if(head==null){
	            return head;
	        }else{
	            ListNode lastNode=reverse(head);
	            lastNode.next=null;
	        }
	        return newNode;
	        
	    }
	    public ListNode reverse(ListNode current){
	        if(current.next==null){
	            newNode=current;
	            return current;
	        }else{
	            ListNode lastNode=reverse(current.next);
	            lastNode.next=current;
	            return current;
	        }
	    }

}
