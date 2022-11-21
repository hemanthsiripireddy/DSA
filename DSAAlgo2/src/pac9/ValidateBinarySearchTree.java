package pac9;
import pac1.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
	List<Integer>list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        helper(root);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1))
            return false;
        }
        return true;
        
    }
    public void helper(TreeNode root){
        if(root.left!=null)
        helper(root.left);
        list.add(root.val);
        if(root.right!=null)
        helper(root.right);
    }

}
