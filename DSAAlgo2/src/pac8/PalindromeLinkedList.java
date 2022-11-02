package pac8;
import pac1.*;
public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
        ListNode secondHalfStartNode=findSecondHalfStartNode(head);
        ListNode  lastNode=reverseLinkedList(secondHalfStartNode.next);
        ListNode p1=head,p2=lastNode;
        boolean ans=true;
        while(ans&&p2!=null){
            if(p1.val!=p2.val)ans= false;
            p1=p1.next;
            p2=p2.next;
        }
        secondHalfStartNode.next=  reverseLinkedList(lastNode);
        return ans;


        
    }
    public ListNode findSecondHalfStartNode(ListNode head){
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverseLinkedList(ListNode head){
        ListNode prev=null,cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }

}
