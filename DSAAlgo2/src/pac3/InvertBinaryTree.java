package pac3;

public class InvertBinaryTree {
	 public TreeNode invertTree(TreeNode root) {
	        return invert(root);
	        
	    }
	    public TreeNode invert(TreeNode root){
	        if(root!=null){
	            TreeNode node=new TreeNode(root.val);
	            node.left=invert(root.right);
	            node.right=invert(root.left);
	            return node;
	        }
	        return null;
	    }

}
