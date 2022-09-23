package pac3;

public class MergeTwoBinaryTrees {
	public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return fun(root1,root2);
        
    }
    public TreeNode fun(TreeNode root1,TreeNode root2){
        if(root1!=null||root2!=null){
            if(root1!=null&&root2!=null){
                root1.val+=root2.val;
                root1.left=fun(root1.left,root2.left);
                root1.right=fun(root1.right,root2.right);
                return root1;
            }
            else if(root1!=null){
            root1.left=fun(root1.left,null);
                root1.right=fun(root1.right,null);
                return root1;
            }
            else{
                 root2.left=fun(null,root2.left);
                root2.right=fun(null,root2.right);
                return root2;
            }
        }
        return null;
    }

}
