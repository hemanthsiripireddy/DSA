package pac3;

public class InvertBinaryTree2 {
	 public TreeNode invertTree(TreeNode root) {
	        return invert(root);
	        
	    }
	    public TreeNode invert(TreeNode node){
	        if(node!=null){
	            TreeNode left=node.left;
	            TreeNode right=node.right;
	            node.left=invert(right);
	            node.right=invert(left);
	          //  return node;
	        }
	        return node;
	    }

}
