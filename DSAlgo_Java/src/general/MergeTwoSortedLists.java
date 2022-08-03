package general;


  
 
public class MergeTwoSortedLists {
	
	/**
	 * Definition for singly-linked list.
	 * publ
	 * }
	 */
	
	    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	      ListNode head=new ListNode(0);
	        ListNode newList =head;
	        while(list1!=null&&list2!=null){
	            if(list1.val<list2.val){
	                newList.next=list1;
	                list1=list1.next;
	            }
	            else{
	                newList.next=list2;
	                list2=list2.next;
	                
	            }
	            newList=newList.next;
	        }
	         if(list1==null) newList.next=list2;
	    if(list2==null) newList.next=list1;
	        return head.next;
	        
	    }
	   
	
	
}
