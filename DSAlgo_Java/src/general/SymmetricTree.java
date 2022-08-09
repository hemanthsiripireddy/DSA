package general;

public class SymmetricTree {
	 public boolean isSymmetric(TreeNode root) {
	        return isSym(root.left,root.right);
	        
	    }
	    public static boolean isSym(TreeNode n1,TreeNode n2){
	        if(n1==null &&n2==null)return true;
	        if(n1==null||n2==null)return false;
	        return n1.val==n2.val &&isSym(n1.left,n2.right)&&isSym(n1.right,n2.left);
	            
	        
	        
	    }

}
