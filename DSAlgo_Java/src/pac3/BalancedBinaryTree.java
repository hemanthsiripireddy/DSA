package pac3;
import general.*;

public class BalancedBinaryTree {
	 boolean v=true;;
	    public boolean isBalanced(TreeNode root) {
	        fun(root);
	        return v;
	        
	    }
	    public int fun(TreeNode root){
	        if(root==null)return 0;
	        int l=fun(root.left),r=fun(root.right);
	        
	       int d=Math.abs(l-r);
	        if(d>1)
	            v=false;
	        return Math.max(l,r)+1;
	        
	    }
	    

}
