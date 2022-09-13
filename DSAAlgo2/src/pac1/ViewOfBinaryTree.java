package pac1;
import java.util.List;

public class ViewOfBinaryTree {
	public int maxLevel;
	public Node root;
	
	public ViewOfBinaryTree(int maxLevel) {
		
		this.maxLevel = maxLevel;
	}

	//public int maxLevel;
	public void leftView(Node root,int level,List<Integer>lst) {
		if(maxLevel<level) {
			lst.add(root.val);
			maxLevel=level;
		}
		if(root.left!=null)leftView(root.left,level+1,lst);
		if(root.right!=null)leftView(root.right,level+1,lst);
		
	}
	public void rightView(Node root,int level,List<Integer>lst) {
		if(maxLevel<level) {
			lst.add(root.val);
			maxLevel=level;
		}
		if(root.right!=null)rightView(root.right,level+1,lst);
		if(root.left!=null)rightView(root.left,level+1,lst);
		
	}

}
