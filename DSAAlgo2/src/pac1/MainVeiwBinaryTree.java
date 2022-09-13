package pac1;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MainVeiwBinaryTree {
  public static void main(String[] args) {
	Node root=new Node(1);
	root.left=new Node(2);
	root.right=new Node(3);
	root.right.right=new Node(6);
	root.left.left=new Node(4);
	root.left.right=new Node(5);
	root.right.left=new Node(9);
	root.right.right=new Node(6);
	root.left.left.left=new Node(45);
	root.right.right.right=new Node(56);
	List<Integer>lst=new ArrayList<Integer>();
	
	 new ViewOfBinaryTree(1).leftView(root.left, 2,lst);
	 Collections.reverse(lst);
	 new ViewOfBinaryTree(0).rightView(root, 1,lst);
	 for(int i=0;i<lst.size();i++) {
		 System.out.println(lst.get(i));
	 }
	
	 		
  }
  


}
/*									1
 * 								2		3
 * 							 4	  5	  9      6
 *							45					56
 */
