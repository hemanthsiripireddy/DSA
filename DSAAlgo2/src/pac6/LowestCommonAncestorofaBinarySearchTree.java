package pac6;
import pac5.*;

public class LowestCommonAncestorofaBinarySearchTree {
	  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        int max=Math.max(p.val,q.val),min=Math.min(p.val,q.val);
	        while(root!=null){
	            if(root.val>max){
	              root=  root.left;
	            }else if(root.val<min){
	               root= root.right;
	            }
	            else
	            break;
	        }
	        return root;
	        
	    }

}
