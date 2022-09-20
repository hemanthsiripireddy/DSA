package pac2;

import java.util.ArrayList;
import java.util.List;

public class ReverseOddLevelsofBinaryTree {
	 public TreeNode reverseOddLevels(TreeNode root) {
	       
	        List<Integer>lst=new ArrayList<>();
	        traverseTree(root,lst,0);
	       // Collections.reverse(lst);
	        modifyTree(root,lst,0);
	        return root;
	        
	    }
	    public void traverseTree(TreeNode node,List<Integer>lst,int level){
	        if(node==null)
	            return;
	        
	        traverseTree(node.left,lst,level+1);
	        if(level%2==1){
	            lst.add(node.val);
	        }
	         traverseTree(node.right,lst,level+1);
	    }
	    public void modifyTree(TreeNode node, List<Integer>lst,int level){
	        if(node==null)
	            return;
	        modifyTree(node.left,lst,level+1);
	        if(level%2==1){
	            node.val=lst.remove(lst.size()-1);
	        }
	        modifyTree(node.right,lst,level+1);
	        
	    }

}
