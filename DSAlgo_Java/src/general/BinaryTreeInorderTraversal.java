package general;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
	List<Integer>lst;
    public List<Integer> inorderTraversal(TreeNode root) {
        lst=new ArrayList<>();
        
        if(root==null)return lst;
       
        else inorder(root);
        return lst;
        
    }
    public void inorder(TreeNode root){
        if(root.left!=null) inorder(root.left);
        lst.add(root.val);
         if(root.right!=null)inorder(root.right);
        
    }

}
