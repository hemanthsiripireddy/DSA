package pac11;

import java.util.ArrayList;
import java.util.List;

public class ReverseNodesinKGroups {
	public static void method() {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		//List
		ListNode node=reverseKGroup(head,3);
		int count=0;
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
			count++;
			if(count==117)
				break;
		}

	}

	static List<ListNode> list;

	public static ListNode reverseKGroup(ListNode head, int k) {
		int flag = 0;
		list = new ArrayList<>();
		ListNode node = head;
		ListNode startPrev = null;
		while (node != null) {
			int i = 0;

			ListNode start = node;
			while (i != k && node != null) {
				list.add(node);
				i++;
				node = node.next;
			}
			i = 0;

			if (list.size() == k) {
				if (flag == 0) {
					head = list.get(list.size() - 1);
					flag = 1;
				}
				reverse(start, startPrev, k);

			}
			list = new ArrayList();
			startPrev = start;

		}

		return head;

	}

	public static  void reverse(ListNode startNode, ListNode startPrev, int k) {

		for (int i = 0; i < k / 2; i++) {
			ListNode lastNode = list.get(list.size() - 1);
			ListNode lastPrev = lastPrev = list.get(list.size() - 2);

			ListNode temp = startNode.next;
			if (startPrev != null)
				startPrev.next = lastNode;
			startNode.next = lastNode.next;
		
			
			if(lastNode==temp) {
				lastNode.next=startNode;
			}else {
				lastPrev.next = startNode;
				lastNode.next = temp;
			}
			
			list.remove(list.size() - 1);
			startPrev = lastNode;
			startNode = lastNode.next;

		}

	}

}
