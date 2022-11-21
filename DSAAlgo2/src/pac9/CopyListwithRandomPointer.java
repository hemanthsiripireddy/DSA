package pac9;

import java.util.HashMap;
import java.util.Map;

public class CopyListwithRandomPointer {
	 public Node copyRandomList(Node head) {
		    Map<Node,Node>map=new HashMap<>();
		    Node first=head;
		    while(head!=null){
		        Node copy=new Node(head.val);
		        map.put(head,copy);
		        head=head.next;
		    }
		    head=first;
		    while(head!=null){
		        Node copy=map.get(head);
		        copy.next=map.get(head.next);
		        copy.random=map.get(head.random);
		        head=head.next;
		    }
		    return map.get(first);
	 }

}
