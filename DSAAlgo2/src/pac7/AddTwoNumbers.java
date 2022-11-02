package pac7;

public class AddTwoNumbers {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         int carry=0;
         ListNode root=null;
         ListNode root1=null;
      while(l1!=null||l2!=null){
            int x=0,y=0;
        if(l1!=null){
            x=l1.val;
            l1=l1.next;

        }
        if(l2!=null){
            y=l2.val;
            l2=l2.next;
        }
        if(root==null){
            root=new ListNode((x+y)%10);
            carry=(x+y)/10;
            root1=root;
        }
        else{
            root.next=new ListNode((x+y+carry)%10);
            carry=(x+y+carry)/10;
            root=root.next;
        }

      }
      if(carry>0){
          root.next=new ListNode(carry);
      }
      return root1;

        
    }

}
