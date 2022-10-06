package pac5;

public class SmallestSubtreewithalltheDeepestNodes {
	public TreeNode subtreeWithAllDeepest(TreeNode root) {
        TreeNode parent=root;
        int leftDepth=depthCalc(root.left);
        int rightDepth=depthCalc(root.right);
        while(leftDepth!=rightDepth){
            if(leftDepth>rightDepth){
                parent=parent.left;
            }else
            parent=parent.right;
             leftDepth=depthCalc(parent.left);
             rightDepth=depthCalc(parent.right);
        }
        return parent;
       
        
    }
    private int depthCalc(TreeNode node){
        if(node==null) return 0;
        return Math.max(depthCalc(node.left),depthCalc(node.right))+1;
    }

}
