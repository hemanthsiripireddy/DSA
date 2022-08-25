package pac2;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headALength=0,headBLength=0;
        ListNode head1=headA,head2=headB;
        while(head1!=null){
            headALength++;
            head1=head1.next;
        }
           while(head2!=null){
            headBLength++;
            head2=head2.next;
        }
        head1=headA;
        head2=headB;
        if(headALength<headBLength){
            int d=headBLength-headALength;
            while(d>0){
               head2= head2.next;
                   d--;
            }
            while(head1!=null){
                if(head1==head2)return head2;
                head1=head1.next;
                head2=head2.next;
            }
            return null;
            
        }else{
             int d=headALength-headBLength;
            while(d>0){
               head1= head1.next;
                   d--;
            }
            while(head1!=null){
                if(head1==head2)return head2;
                head1=head1.next;
                head2=head2.next;
            }
            return null;
            
        }
        
        
    }
}
