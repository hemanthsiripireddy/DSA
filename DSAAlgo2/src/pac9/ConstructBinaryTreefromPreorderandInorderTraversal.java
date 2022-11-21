package pac9;

import java.util.HashMap;
import java.util.Map;

import pac1.TreeNode;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	Map<Integer,Integer>map;
    int var=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,preorder.length-1);
        
    }
    public TreeNode helper(int[] preorder,int left,int right){
        if(left>right)return null;
        TreeNode root=new TreeNode(preorder[var++]);
        root.left=helper(preorder,left,map.get(root.val)-1);
        root.right=helper(preorder, map.get(root.val)+1,right);
        return root;
    }

}
